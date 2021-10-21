package com.pb.alekhin.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        System.out.println("Угадайте число которое загадала программа (0-100).");
        System.out.println("Для выхода из программы введите - 505.");

        final int MAX_ATTEMPT;
        int attempt = 0;
        Random random = new Random();
        int x = random.nextInt(101);
        int y;

        Scanner num = new Scanner(System.in);

        while (true) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            y = num.nextInt();
            if (y == 505) {
                break;
            }
            if (y < x) {
                System.out.println("Загаданое число больше");
            } else if (y > x) {
                System.out.println("Загаданое число меньше");
            }
            if (y == 505) {
                break;
            }
            if (y != x) {
                continue;
            }
            System.out.println("Biiiiingooooo!!! Вы угадали с " + attempt + " попытки!");
            break;
        }
        System.out.println("Конец игры!");
    }
}
