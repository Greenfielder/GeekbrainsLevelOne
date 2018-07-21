package ru.geekbrains.savenko.j1lesson2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Первое задание");

        invert();
        System.out.println("");
        System.out.println("Второе задание");

        arrayEight();
        System.out.println("");
        System.out.println("Третье задание");

        littleArray();
        System.out.println("");
        System.out.println("Четвёртое задание");

        diagonal();
        System.out.println("");
        System.out.println("Пятое задание");
        minAndMax();

        System.out.println("");
        System.out.println("Шестое задание");
        int[] arr = {8, 5, 3, 2, 14};
        System.out.println(isBalance(arr));

    }

    private static void invert() {
        int[] arr = {0, 0, 0, 1, 1, 1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
    }

    private static void arrayEight() {
        int[] arr = new int[8];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = j;
            j = j + 3;
            System.out.print(arr[i] + " ");
        }
    }

    private static void littleArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }

    private static void diagonal() {
        int xx = 5;
        int[][] arr = new int[xx][xx];

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }

        for (int[] xArr : arr) {
            for (int yArr : xArr) {
                System.out.print(yArr + " ");
            }
            System.out.println();
        }
    }

    private static void minAndMax() {
        int min = 0;
        int max = 0;
        int[] arr = {6, 5, 3, 2, 11, 54, 12, 10};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            } else if (arr[i] > arr[max])
                max = i;
        }
        System.out.println(arr[min] + " " + arr[max]);
    }

    private static boolean isBalance(int[] arr) {
        int s = 0;
        int f = 0;

        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }

        if (s % 2 != 0) {
            return false;
        } else {
            int x = s / 2;

            for (int i = 0; i < arr.length; i++) {
                f += arr[i];

                if (x > f) {
                } else if (x == f) {
                    return true;
                } else if (x < f) {
                    return false;
                }
            }
        }
        return isBalance(arr);
    }
}
