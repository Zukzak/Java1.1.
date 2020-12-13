package com.andr.practice;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        Double[] userMassive = new Double[size];
        System.out.println("Введите значения массива:");
        for (int i = 0; i < size; i++) {
            userMassive[i] = input.nextDouble();
        }
        System.out.print ("Массив:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + userMassive[i]);
        }
        System.out.print ("\n");
        for (Double aDouble : userMassive) sum = sum + aDouble;

        double arifm = sum/userMassive.length;

        System.out.printf ("Среднее арифмитическое массива - %.2f ", + arifm);
        System.out.print ("\n");

        for (int i = 0; i < userMassive.length; i++) {
            userMassive[i] =  userMassive[i]*arifm;
        }
        System.out.print ("Массив где каждый элемент умножен на среднее арифмитическое:");
        for (int i = 0; i < size; i++) {
            System.out.printf (" %.2f ", userMassive[i]);
        }
        System.out.print ("\n");
    }
}