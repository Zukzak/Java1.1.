package com.andr.practice;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int n;

        do {
            System.out.println("Введите любое положительное число: ");
            n = input.nextInt();
        }
        while  (n%2==1);

        for (int i = 0; i < n; i++) {
            if (i%2==1) sum = sum + i;
        }
        System.out.print ("Сумма нечетных чисел до числа - " + n + " равна " + sum);
    }
}