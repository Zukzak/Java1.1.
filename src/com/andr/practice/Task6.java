package com.andr.practice;
import java.util.Scanner;

public class Task6 {
    public static void main (String[] args) {
        double num;
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = in.nextInt();

        if (x==2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int y = in.nextInt();
            System.out.println("Введите число");
            num = in.nextDouble();
            in.close();
            switch (y) {
                case 1: System.out.println("Метры - " + num + " Мили - " + num/1609 + " Ярды - " + num*1.094 + " Футы - " + num*3.281);
                    break;
                case 2: System.out.println("Метры - " + num*1609 + " Мили - " + num + " Ярды - " + num*1760 + " Футы - " + num*5280);
                    break;
                case 3: System.out.println("Метры - " + num/1.094 + " Мили - " + num/1760 + " Ярды - " + num + " Футы - " + num*3);
                    break;
                case 4: System.out.println("Метры - " + num/3.281 + " Мили - " + num/5280 + " Ярды - " + num/3 + " Футы - " + num);
                    break;
            }
        }
        else if (x==1){
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3-фунт");
            int z = in.nextInt();
            System.out.println("Введите число");
            num = in.nextDouble();
            switch (z) {
                case 1: System.out.println("Килограммы - " + num/1000 + " Граммы - " + num + " Фунты - " + num/454);
                    break;
                case 2: System.out.println("Килограммы - " + num + " Граммы - " + num*1000 + " Фунты - " + num/2.205);
                    break;
                case 3: System.out.println("Килограммы - " + num*2.205 + " Граммы - " + num*454 + " Фунты - " + num);
                    break;
            }
        }
    }
}