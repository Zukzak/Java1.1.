package com.andr.practice;
import java.util.ArrayList;
import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        String a;
        String strmax = "";
        int max =0;
        int i = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Количество строк: ");
        int n = in.nextInt();

        do {
            System.out.print("Введите строку:");
            a = in.next();
            System.out.println("Строка " + i + ": " + a);
            str.add(a);
            i++;
        }
        while (!(i ==n+1));

        for (int j=0; j<=str.size()-1; j++) {
            if (max<str.get(j).chars().distinct().count()) {
                max = (int) str.get(j).chars().distinct().count();
                strmax = str.get(j);
            }
        }
        System.out.println("Строка с максимальным колличеством разных символов: " + strmax);
    }
}