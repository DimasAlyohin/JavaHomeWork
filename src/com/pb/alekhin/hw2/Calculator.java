package com.pb.alekhin.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        int x;
        int y;
        String symbol;

        System.out.print("Укажите первое числовое значение:");

        x = calc.nextInt();

        System.out.print("Укажите знак арифметического действия (+,-,*,/):");

        symbol = calc.next();

        System.out.print("Укажите второе числовое значение:");

        y = calc.nextInt();

        switch (symbol) {
            case "+":
                System.out.println("Ответ:" + (x+y));
                break;
            case "-":
                System.out.println("Ответ:" + (x-y));
                break;
            case "*":
                System.out.println("Ответ:" + (x*y));
                break;
            case "/":
                if (y == 0) {
                    System.out.println("Делить на 0 нельзя");
                }   else {System.out.println("Ответ:" + (x/y));
                }
        }
    }
}
