package com.pb.alekhin.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        System.out.println("Угадайте задуманное число с десяти попыток.");
        System.out.println("Для выхода из программы введите - сдаюсь.");
        System.out.println("Попитка 1. Ведите число от 0 до 100:");

        final int MAX_ATTEMPT = 5;
        int attempt = 1;
        Random random = new Random();
        int x = random.nextInt(101);
        int y;
        String exit = "сдаюсь";
        System.out.println(x);

        Scanner num = new Scanner(System.in);

        y = num.nextInt();

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            if (y < x) {
                System.out.println("Попытка " + attempt + ".Загаданное число больше:");
            } else {
                System.out.println("Попытка " + attempt + ".Загаданное число меньше:");
            }
            y = num.nextInt();
            // или (занятие 2 как превращать строку в число)
            String value = num.next();


            if (value.equals("сдаюсь")) {
                break;


            }



        }
        System.out.println("Конец игры!");
    }
}
