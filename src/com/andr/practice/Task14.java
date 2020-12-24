package com.andr.practice;
import java.util.Random;


public class Task14 {
    public static void main(String[] args) {
        int max = -21;
        int min = 21;
        Random random = new Random();

        int[] m = new int[15];

        for (int i=0; i<=m.length-1; i++) {
            m[i] = random.nextInt(41) - 20;
            if (max<=m[i]) max = m[i];
            if (m[i]<=min) min = m[i];
        }
        System.out.print ("Массив:");
        for (int j : m) {
            System.out.print(" " + j);
        }
        System.out.print ("\n");
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("минимальныйальный элемент массива: " + min);

        int resultMax = Math.max(Math.abs(max),Math.abs(min));

        System.out.println("Наибольший по модулю элемент массива: " + resultMax);

    }
}