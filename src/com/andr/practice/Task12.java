package com.andr.practice;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a;

        do {
            System.out.println("Введите фразу: I like Java!!!");
            a = input.nextLine();
        }
        while  (!a.equals("I like Java!!!"));

        System.out.println(a);
        Boolean str1 = a.contains("Java");
        Boolean str2 = a.startsWith("I like");
        Boolean str3 = a.endsWith("!!!");

        System.out.println("Строка содержит слово Java - " + str1);
        System.out.println("Строка начинается с I like - " + str2);
        System.out.println("Строка заканчивается !!! - " + str3);

        if (str1 & str2 & str3) System.out.println(a.toUpperCase());
        String b = a.replaceAll("a","o").substring(7,12);
        System.out.println(b);

    }
}
