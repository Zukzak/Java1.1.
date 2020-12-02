package com.andr.practice;

public class Task3 {
    public static void main (String[] args) {
        //задание 3
        int[] num = {12, 2, 20, 1, 5};
        //Массив до изменения
        for (int k : num) {
            System.out.print(k + " ");
        }
        System.out.println();
        int c = num[0];
        int d = num[num.length-1];
        int e = num[num.length/2];

        num[0] = num[4];
        num[4] = c;

        //Массив после изменения
        for (int j : num) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println("Сумма среднего и последнего элемента - " + (d + e));
    }
}
