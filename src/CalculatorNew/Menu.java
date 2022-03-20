package CalculatorNew;

import java.util.Scanner;

public class Menu extends Calculation {
    double a;
    double b;
    String w;
    int i;
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("Если хотите произвести математическую операцию - нажмите 1, если выйти- то 0 !!");
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                calculate();
                break;
            case 0:
                System.out.println("Вы вышли из программы!");
                break;
        }
    }
    public void calculate() {

        System.out.println("Введите первое число!");
        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
            System.out.println("Спасибо! Вы ввели первое число : " + a);
        } else {
            System.out.println("Вы ввели не число! Перезапустите программу и введите корректное значение!!");
        }
        System.out.println("Введите второе число!");
        if (scanner.hasNextDouble()) {
            b = scanner.nextDouble();
            System.out.println("Спасибо! Вы ввели второе число : " + b);
        } else {
            System.out.println("Вы ввели не число! Перезапустите программу и введите корректное значение!!");
        }
        System.out.println("Введите арифметическое действие!");
        if (scanner.hasNextLine()) {
            w = scanner.next();
            System.out.println("Спасибо! Ваше арифметическое действие : " + w);
        } else {
            System.out.println("Извините ! Такого действия не существует!!");
        }
        action(a , b , w);
    }
}
