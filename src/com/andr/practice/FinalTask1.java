package com.andr.practice;
import java.util.Scanner;


public class FinalTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Курс доллара: ");
        Double kurs = in.nextDouble();
        System.out.println("Количество рублей: ");
        Double rub = in.nextDouble();
        Double result = rub/kurs;
        System.out.printf ("Итого: %.2f долларов", result);
    }
}
