package ru.geekbrains.savenko.j1lesson3;
import java.util.Scanner;

public class Main {

    static int count = 3;
    static int number = (int) (Math.random() * 10);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\u001B[31m" + "ОТГАДАЙ ЧИСЛО ОТ 0 ДО 10");
        playLevel();
        System.out.println("\u001B[35m" + "GAME COMPLETE!");
        scanner.close();
    }
//Игровая логика
    private static void playLevel() {
        while (true) {
            System.out.println("\u001B[31m" + "У вас " + count + " попытки");
            System.out.println("\u001B[32m" + "Введите число от 0 до 10");
            int inNumber = scanner.nextInt();
            count--;
            if (inNumber == number && count != 0) {
                System.out.println("\u001B[31m" + "SUCCESS!");
                if (chooseMenu()) break;
            } else if (inNumber > number && count != 0) {
                System.out.println("Загаданное число меньше");
            } else if (inNumber < number && count != 0) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("GAME OVER! :(");
                if (chooseMenu()) break;
            }
        }
    }
// Метод вызывающегося диалогового меню в конце игры, предлогающий повторить игру
    private static boolean chooseMenu() {
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int choose = scanner.nextInt();
        if (choose == 1) {
            count = 3;
            number = (int) (Math.random() * 10);
        } else if (choose == 0) {
            return true;
        } else {
            System.out.println("Неверный выбор");
            return true;
        }
        return false;
    }
}
