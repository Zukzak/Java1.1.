package com.andr.practice;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите фразу:");
        String a = input.nextLine();

        String[] words = a.split(" ");

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                System.out.println(word);
                ++n;
            }
        }
        System.out.println("Колличество слов: " + n);
    }
}