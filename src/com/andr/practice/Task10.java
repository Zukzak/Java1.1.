package com.andr.practice;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите колличество строк матрицы: ");
        int string = input.nextInt();
        System.out.println("Введите колличество столбцов матрицы: ");
        int row = input.nextInt();
        int[][] userMassive = new int[string][row];
        System.out.println("Введите значения массива:");
        for (int i = 0; i < string; i++) {
            for (int j = 0; j < row; j++) {
                userMassive[i][j] = input.nextInt();
            }
        }
        System.out.print ("первая строка массива умноженная на 3:");
        for (int i = 0; i < row; i++) {
            System.out.print (" " + userMassive[0][i]*3);
        }
        System.out.print ("\n");
    }
}