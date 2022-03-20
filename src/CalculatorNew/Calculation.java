package CalculatorNew;

import java.util.Scanner;

public class Calculation implements InterfaceCalculator {

    @Override
    public void action(double a, double b, String w) {
        if (w.equals("+")) {
            System.out.println(a + b);
        } else if (w.equals("-")) {
            System.out.println(a - b);
        } else if (w.equals("*")) {
            System.out.println(a * b);
        } else if (w.equals("/")) {
            System.out.println(a / b);
        } else {
            System.out.println("Такой математической операции не существует");
        }
    }
}
