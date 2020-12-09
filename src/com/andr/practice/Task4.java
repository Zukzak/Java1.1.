package com.andr.practice;
import java.util.Scanner;

public class Task4 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x");
        int x = in.nextInt();
        System.out.println("Введите число y");
        int y = in.nextInt();
        System.out.println("Введите число z");
        int z = in.nextInt();
        in.close();

        double sred = (double) (x+y+z)/3;

        String result = String.format("%.2f", sred);
        System.out.println("Среднее арифмитическое -" + result);

        double c = sred/2;

        if (c>3) {
            System.out.println("Программа выполнена корректно");
        }

    }
}