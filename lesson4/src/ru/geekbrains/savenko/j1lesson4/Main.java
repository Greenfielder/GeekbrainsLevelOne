package ru.geekbrains.savenko.j1lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int cellsNumber = 5;
    private static int winNumber = 4;
    private static char cellSymbol = '*';
    private static char xChar = 'X';
    private static char oChar = 'O';
    private static char[][] map = new char[cellsNumber][cellsNumber]; // игровое поле
    private static Scanner scanner = new Scanner(System.in); // Scanner для чтения консоли
    private static Random random = new Random(); // генератор случайных чисел

    private static void initMap() { // инициализируем массив map(игровое поле)
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = cellSymbol;
            }
        }
    }

    private static void showMap() { // выводим игровое поле в консоль
        System.out.println(". 1 2 3 4 5");
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("ИГРА: КРЕСТИКИ НОЛИКИ");
        System.out.println("Выберите противника: ");
        System.out.println("1. Против компьютера.");
        System.out.println("2. Против второго игрока.");
        System.out.println("3. Выход.");
        int i;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        switch (i) {
            case 1: {
                humanVsCpu();
                break;
            }
            case 2: {
                humanVsHuman();
                break;
            }
            case 3: {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Введите число от 1 до 3");
            }
        }
        System.out.println("Game Over");
    }

    private static void humanVsCpu() {
        initMap();
        showMap();
        while (true) { // запускаем игровой цикл
            humanTurn();
            showMap();
            if (isVictory(xChar)) { // проверка победы человека
                System.out.println("Победил игрок");
                break;
            }
            if (isMapFull()) {  // если поле заполнилось, завершаем игру
                System.out.println("Ничья");
                break;
            }
            cpuTurn();
            showMap();
            if (isVictory(oChar)) { // проверка победы компьютера
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) break;
        }
    }

    private static void humanVsHuman() {
        initMap();
        showMap();
        while (true) { // запускаем игровой цикл
            humanTurn();
            showMap();
            if (isVictory(xChar)) { // проверка победы человека
                System.out.println("Победил игрок 1");
                break;
            }
            if (isMapFull()) {  // если поле заполнилось, завершаем игру
                System.out.println("Ничья");
                break;
            }
            human2Turn();
            showMap();
            if (isVictory(oChar)) { // проверка победы второго игрока
                System.out.println("Победил игрок 2");
                break;
            }
            if (isMapFull()) break;
        }
    }

    private static boolean isVictory(char c) { // Проверяем победили ли

        for (int column = 0; column < cellsNumber - winNumber + 1; column++) {
            for (int row = 0; row < cellsNumber - winNumber + 1; row++) {
                if (checkDiagonal(c, column, row) || checkLanes(c, column, row)) return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonal(char c, int x, int y) { // проверка диагоналей
        boolean right = true;
        boolean left = true;

        for (int i = 0; i < winNumber; i++) {
            right = right & (map[i + x][i + y] == c);
            left = left & (map[winNumber - i - 1 + x][i + y] == c);
        }
        if (right || left) return true;
        return false;
    }

    private static boolean checkLanes(char c, int x, int y) { // проверка вертикальных и горизонтальных линий
        boolean columns, rows;

        for (int i = x; i < winNumber + x; i++) {
            columns = true;
            rows = true;

            for (int j = y; j < winNumber + y; j++) {
                columns = columns & (map[i][j] == c);
                rows = rows & (map[j][i] == c);
            }
            if (columns || rows) return true;
        }
        return false;
    }

    private static void humanTurn() { // ход человека
        int x, y;
        do {
            System.out.println("Введите координаты в формате Х и У");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        map[y][x] = xChar;
    }

    private static void human2Turn() { // ход человека
        int x, y;
        do {
            System.out.println("Введите координаты в формате Х и У");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        map[y][x] = oChar;
    }

    private static boolean isMapFull() { // проверка на заполненость карты
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == cellSymbol) return false; // если на поле нашли хотя бы одну *, значит поле еще не заполнилось
            }
        }
        return true;
    }

    private static void cpuTurn() { // ход компьютера
        int x, y;
        do { // компьютер пытается случайно выбрать незанятое поле для хода
            x = random.nextInt(map.length);
            y = random.nextInt(map.length);
        } while (!isCellEmpty(x, y));
        map[y][x] = oChar; // как только ячейка найдена, ставим туда О
    }

    public static boolean isCellEmpty(int x, int y) { // проверка является ли ячейка свободной
        if (x < 0 || x > map.length - 1 || y < 0 || y > map.length - 1)
            return false; // если указаны неверные координаты, считаем что ячейка условно занята
        if (map[y][x] != cellSymbol) return false; // если в ячейке не *, значит занята
        return true; // ячейка свободна
    }
}