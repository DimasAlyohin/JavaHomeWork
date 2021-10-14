package com.pb.alekhin.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;

        System.out.println("Выберите любое число от 1 до 100: ");
        x = in.nextInt();

        if (x>0 && x<15) {
            System.out.println("Вы попали в промежуток [1-14]");
        } else if (x > 14 && x < 36) {
            System.out.println("Вы попали в промежуток [15-35]");
        } else if (x > 35 && x < 51) {
            System.out.println("Вы попали в промежуток [36-50]");
        } else if (x > 50 && x < 101) {
            System.out.println("Вы попали в промежуток [51-100]");
        } else {
            System.out.println("Вы не попали не в один из указанных промежутков :( Попробуйте снова и укажите число не больше 100:");
            x = in.nextInt();
            if (x>0 && x<15) {
                System.out.println("Вы попали в промежуток [1-14]");
            } else if (x > 14 && x < 36) {
                System.out.println("Вы попали в промежуток [15-35]");
            } else if (x > 35 && x < 51) {
                System.out.println("Вы попали в промежуток [36-50]");
            } else if (x > 50 && x < 101) {
                System.out.println("Вы попали в промежуток [51-100]");
            } else {
                System.out.println("Вы снова не попали не в один из указанных промежутков :( Похоже вам нужно больше времени уделить изучению математики. Пока) ");
            }
        }

    }
}
