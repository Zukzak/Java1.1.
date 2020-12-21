package com.andr.practice;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число");
        String a = input.next();
        System.out.println("Введите второе число");
        int b = input.nextInt();
        System.out.println(Math.max(Integer.parseInt(a),b));
        System.out.println(Double.valueOf(Math.min(Integer.parseInt(a),b)));
    }
}