package ru.geekbrains.Lesson3;


import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        revertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        retValue(5, 6);
        maxAndMin();
        checkBalance(new int[]{5, 5, 5, 5, 5});
        modifyArr(new int[]{2,1,3,5,8}, 5);
    }

    private static void revertArray() {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int max = mass.length;
        for (int i = 0; i < max; i++) {
            if (mass[i] == 1) {
                mass[i] = 0;
            } else {
                mass[i] = 1;
            }
        }
    }

    private static void fillArray() {
        int[] arr = new int[101];
        for (int i = 0; i <= 100; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    private static void changeArray() {
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxMas = mas.length;
        for (int i = 0; i < maxMas; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        }
        for (int i = 0; i < maxMas; i++) {
            System.out.print(i + "-" + mas[i] + " ");
        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == j) || (i == 5 - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] retValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
    private static void maxAndMin() {
        int[] arr = {3, 2,1, 6, 11, 7, 8, 9, 12, 4, 13, 14, -9};
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
            max = (max > arr[i]) ? max : arr[i];
        }
        System.out.println("\nminimal element is: " + min + "\nmaximal element is: " + max);
    }
    private static boolean checkBalance(int[]arr) {
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < arr.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }
    private static void modifyArr(int[] m, int n) {
            if (n > 0) {
                for (int i = 0; i < 5; i++) {
                    int tmp = m[m.length - 1];
                    for (int j = m.length - 1; j > 0; j--) {
                        m[j] = m[j - 1];
                    }
                    m[0] = tmp;
                }
            } else if (5 < 0) {
                for (int i = 0; i < 5 * (-1); i++) {
                    // Left
                    int tmp = m[0];
                    for (int j = 0; j < m.length - 1; j++) {
                        m[j] = m[j + 1];
                    }
                    m[m.length - 1] = tmp;
                }
            }
    }


    }
















