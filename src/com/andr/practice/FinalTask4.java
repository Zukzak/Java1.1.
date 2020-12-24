package com.andr.practice;
import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        String a;
        Scanner in = new Scanner(System.in);

        System.out.println("Загадка - Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает \n Всего 3 попытки! \n При первой попытке можно написать \"Подсказка\" для получения подсказки.");

        System.out.print("Введите отгадку:");
        a = in.nextLine();

        if (a.equals("Заархивированный вирус")) {
            System.out.println("Правильно");
            System.exit(0);
        }
        if (a.equals("Подсказка")) {
            System.out.println("Загадка не про лук, кстати если не отгадаешь сейчас - проиграешь!");
            System.out.print("Введите отгадку:");
            a = in.nextLine();

            if ( a.equals("Подсказка")) {
                System.out.print("Подсказка уже была. Следующая попытка последняя!");
                System.out.print("Введите отгадку:");
                a = in.nextLine();

                if (a.equals("Заархивированный вирус")) {
                    System.out.println("Правильно");
                    System.exit(0);
                } else System.out.println("Обидно, приходи в другой раз");
                System.exit(0);
            } else System.out.println("Обидно, приходи в другой раз");
            System.exit(0);

        } else {
            System.out.println("Подумай еще!");
            System.out.print("Введите отгадку:");
            a = in.nextLine();
            if (a.equals("Заархивированный вирус")) {
                System.out.println("Правильно");
                System.exit(0);
            }
            if (a.equals("Подсказка")) {
                System.out.print("Подсказка уже недоступна. Следующая попытка будет принята как ответ!");
                System.out.print("Введите отгадку:");
                a = in.nextLine();
                if (a.equals("Заархивированный вирус")) {
                    System.out.println("Правильно");
                    System.exit(0);
                } else {
                    System.out.println("Подумай еще!");
                    System.out.print("Введите отгадку:");
                    a = in.nextLine();
                    if (a.equals("Подсказка")) {
                        System.out.print("Подсказка уже недоступна. Следующая попытка будет принята как ответ!");
                        System.out.print("Введите отгадку:");
                        a = in.nextLine();
                        if (a.equals("Заархивированный вирус")) {
                            System.out.println("Правильно");
                        } else System.out.println("Обидно, приходи в другой раз");
                        System.exit(0);
                    }

                }
            } else {
                System.out.println("Подумай еще!");
                System.out.print("Введите отгадку:");
                a = in.nextLine();
                if (a.equals("Заархивированный вирус")) {
                    System.out.println("Правильно");
                    System.exit(0);
                }
                if (a.equals("Подсказка")) {
                    System.out.print("Подсказка уже недоступна. Следующая попытка будет принята как ответ!");
                    System.out.print("Введите отгадку:");
                    a = in.nextLine();
                    if (a.equals("Заархивированный вирус")) {
                        System.out.println("Правильно");
                        System.exit(0);
                    } else System.out.println("Обидно, приходи в другой раз");
                    System.exit(0);
                } else System.out.println("Обидно, приходи в другой раз");
                System.exit(0);
            }
            System.out.println("Обидно, приходи в другой раз");
        }
    }
}
