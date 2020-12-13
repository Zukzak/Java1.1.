package com.andr.practice;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        int y = 10;
        int z = 100;
        System.out.println("Константы: х - " + x + " y - " + y + " z - " + z);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int[] userMassive = new int[size];
        System.out.println("Введите значения массива:");
        for (int i = 0; i < size; i++) {
            userMassive[i] = input.nextInt();
        }
        System.out.print ("Массив:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + userMassive[i]);
        }
        System.out.print ("\n");
        for (int j : userMassive) {
            if (j == x) System.out.println("Данное значение имеется в константах - " + j) ;
            if (j == y) System.out.println("Данное значение имеется в константах - " + j) ;
            if (j == z) System.out.println("Данное значение имеется в константах - " + j) ;
        }

    }
}