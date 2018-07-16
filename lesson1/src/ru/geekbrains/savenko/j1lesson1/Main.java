package ru.geekbrains.savenko.j1lesson1;

//First lesson home work

public class Main {

    public static void main(String[] args) {

        byte byteA = 10;
        short shortB = 100;
        int intC = 1000;
        long longD = 10000;
        float floatE = 100.0f;
        double doubleF = 100.0d;
        char charG = 'X';
        boolean booleanH = true;
        String name = "John Williams";

        int aa = 10, bb = 20, cc = 15, dd = 5;

        System.out.println(calculating(aa, bb, cc, dd));
        System.out.println(isBetween(aa, dd));
        isPositiveOrNegative(aa);
        System.out.println(isNegative(aa));
        welcome(name);
        visGod(2140);

    }

    public static int calculating(int a, int b, int c, int d) {
        int result = a * (b + (c / d));
        return result;
    }

    public static boolean isBetween(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) {

            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Принятое на вход число " + number + " ПОЛОЖИТЕЛЬНОЕ");
        } else {
            System.out.println("Принятое на вход число " + number + " ОТРИЦАТЕЛЬНОЕ");
        }
    }

    public static boolean isNegative(int newNumber) {
        if (newNumber < 0) {
            return true;
        }
        return false;
    }

    public static void welcome(String name) {
        System.out.println("Привет " + name);
    }

    public static void visGod(int year) {

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " Високосный год");
        } else {
            System.out.println(year + " Невисокосный год");
        }
    }
}
