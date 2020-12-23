package com.andr.practice;
import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        int i = 1;
        String a;
        boolean podsk = false;
        Scanner in = new Scanner(System.in);

        System.out.println("Загадка - Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает \n Всего 3 попытки! \n При первой попытке можно написать \"Подсказка\" для получения подсказки.");

        do {
            System.out.print("Введите отгадку:");
            a = in.nextLine();
            if (a.equals("Заархивированный вирус")) {
                System.out.println("Правильно");
                System.exit(0);
            }

            if (i==1&a.equals("Подсказка")) {
                System.out.println("Загадка не про лук");
                podsk =true;
                --i;
            }
            if ((i==2|i==3) & a.equals("Подсказка")) {
                System.out.println("Подсказка уже недоступна");
                --i;
            }

            if (i==2&podsk) {
                System.out.println("Обидно, приходи в другой раз");
                System.exit(0);
            }

            System.out.println("Подумай еще!");
            i++;

        }
        while (!(i ==4));
        System.out.println("Обидно, приходи в другой раз");
    }
}