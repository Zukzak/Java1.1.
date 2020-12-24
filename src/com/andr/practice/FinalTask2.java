package com.andr.practice;
import java.util.ArrayList;
import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> ur = new ArrayList<>();
        String a;
        String znak;
        String b;
        String c;
        int result = 0;

        System.out.println("Для решения уравнения вида \"a+(-)b=c\" введите 2 двухзначных числа и х в любом порядке");

        do {
            System.out.println("Введите первое число от 0 до 99 или х: ");
            a = input.next();
            ur.add(0,a);
        }
        while  (!((a.equals("x")&(a.length()==1))|(a.matches("[0-9]+")&(a.length()<=2))));
        do {
            System.out.println("Введите + или -: ");
            znak = input.next();
            ur.add(1,znak);
        }
        while  (!(znak.equals("+")|znak.equals("-")));
        do {
            System.out.println("Введите второе число от 0 до 99 или х: ");
            b = input.next();
            ur.add(2,b);
            ur.add(3,"=");
        }
        while  (!((b.equals("x")&(b.length()==1))|(b.matches("[0-9]+")&(b.length()<=2))));
        do {
            System.out.println("Введите результат число от 0 до 99 или х: ");
            c = input.next();
            ur.add(4,c);
        }
        while  (!((c.equals("x")&(c.length()==1))|(c.matches("[0-9]+")&(c.length()<=2))));

        if ((a.matches("x"))&(b.matches("[0-9]+"))&(c.matches("[0-9]+"))|(a.matches("[0-9]+"))&(b.matches("x"))&(c.matches("[0-9]+"))|(a.matches("[0-9]+"))&(b.matches("[0-9]+"))&(c.matches("x"))) {
            System.out.print("Уравнение: ");
            for (int i = 0; i<=ur.size()-1; i++){
                System.out.print(" " + ur.get(i));
            }
        }
        else {
            System.out.println("Уравнение записано неверно. Решения не будет");
        }

        if (a.matches("x")) {
            int b1 = Integer.parseInt(b);
            int c1 = Integer.parseInt(c);
            if (ur.get(1).equals("+")) {
                result = c1 - b1;
            } else {
                result = c1 + b1;
            }
        }

        if (b.matches("x")) {
            int a1 = Integer.parseInt(a);
            int c1 = Integer.parseInt(c);
            if (ur.get(1).equals("+")) {
                result = c1 - a1;
            } else {
                result = a1 - c1;
            }
        }

        if (c.matches("x")) {
            int b1 = Integer.parseInt(b);
            int a1 = Integer.parseInt(a);
            if (ur.get(1).equals("+")) {
                result = a1 + b1;
            } else {
                result = a1 - b1;
            }
        }

        System.out.println("\n Решение: х = " + result);

    }
}
