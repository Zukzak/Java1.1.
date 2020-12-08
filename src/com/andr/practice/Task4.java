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

        int sred = (x+y+z)/3;
        System.out.println("Среднее арифмитическое -" + sred);

        int c = sred/2;

        if (c>3) {
            System.out.println("Программа выполнена корректно");
        }

    }
}