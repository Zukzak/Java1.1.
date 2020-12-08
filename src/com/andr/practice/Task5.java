package com.andr.practice;
import java.util.Scanner;

public class Task5 {
    public static void main (String[] args) {

        int res;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int x = in.nextInt();
        System.out.println("Введите второе число ");
        int y = in.nextInt();
        System.out.println("Введите арифмитический знак (+, -, /, *)");
        char z = in.next().charAt(0);
        in.close();

        switch (z) {
            case '+' : res = x+y;
                System.out.println("Сумма числа " + x + " и " + y + " = " + res);
                break;
            case '-' : res = x-y;
                System.out.println("Разница чисел " + x + " и " + y + " = " + res);
                break;
            case '*' : res = x*y;
                System.out.println("Произведение чисел " + x + " и " + y + " = " + res);
                break;
            case '/' :
                if (y==0) {
                    System.out.println("На ноль делить нельзя!");
                }
                else {
                    res = x/y;
                    System.out.println("Частное чисел " + x + " и " + y + " = " + res);
                }
                break;
        }

    }
}
