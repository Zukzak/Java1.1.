package com.andr.practice;
import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a;
        int result = 0;

        System.out.println("Для решения уравнения введите строку \"a+(-)b=c\", с одним х и цифрами [0;9]:");
        a = input.next();

        if (a.charAt(0)=='x') {
            int b1 = Integer.parseInt(String.valueOf(a.charAt(2)));
            int c1 = Integer.parseInt(String.valueOf(a.charAt(4)));
            if (a.charAt(1)=='+') {
                result = c1 - b1;
            } else {
                result = c1 + b1;
            }
        }

        if (a.charAt(2)=='x') {
            int a1 = Integer.parseInt(String.valueOf(a.charAt(0)));
            int c1 = Integer.parseInt(String.valueOf(a.charAt(4)));
            if (a.charAt(1)=='+') {
                result = c1 - a1;
            } else {
                result = a1 - c1;
            }
        }

        if (a.charAt(4)=='x') {
            int b1 = Integer.parseInt(String.valueOf(a.charAt(2)));
            int a1 = Integer.parseInt(String.valueOf(a.charAt(0)));
            if (a.charAt(1)=='+') {
                result = a1 + b1;
            } else {
                result = a1 - b1;
            }
        }

        System.out.println("\n Решение: х = " + result);

    }
}
