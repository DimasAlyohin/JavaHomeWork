package com.pb.alekhin.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Arrey {
    public static void main(String[] args) {
        int[] masiv = new int[10];{

            System.out.println("Придумайте 10 любых чисел, больше меньше или равных 0:");
            System.out.println("(После каждаого введенного числа нажимайте Enter)");
            Scanner scan = new Scanner(System.in);

            masiv[0] = scan.nextInt();
            masiv[1] = scan.nextInt();
            masiv[2] = scan.nextInt();
            masiv[3] = scan.nextInt();
            masiv[4] = scan.nextInt();
            masiv[5] = scan.nextInt();
            masiv[6] = scan.nextInt();
            masiv[7] = scan.nextInt();
            masiv[8] = scan.nextInt();
            masiv[9] = scan.nextInt();

            for (int q = 0; q < masiv.length; q++);

                System.out.println("Вашему вниманию несколько фактов о созданом масиве:");
                System.out.println(" ");
                System.out.println("Так выглядит сам масив :");
                System.out.println(Arrays.toString(masiv) + ";");


            int summa = 0;
            for (int w = 0; w < masiv.length; w++) {
                summa = summa + masiv[w];
            }
                System.out.println(" ");
                System.out.println("Сумма всех чисел масива равна " + summa + ";");


            int summa2 = 0;
            for (int e = 0; e < masiv.length; e++) {
                if (masiv[e] > 0){
                    summa2++;
                }
            }
                System.out.println(" ");
                System.out.println(summa2 + " - ровно столько положительных чисел в вашем масиве;");


            for (int r = 0; r < masiv.length - 1; r++) {
                for (int t = masiv.length - 1; t > r; t--) {
                    if (masiv[t - 1] > masiv[t]) {
                        int cloud = masiv[t - 1];
                        masiv[t - 1] = masiv[t];
                        masiv[t] = cloud;
                    }
                }
            }
                System.out.println(" ");
                System.out.println("А вот ваш массив отсортированный в порядке возростания чисел:");
                System.out.println(Arrays.toString(masiv)+ ".");
                System.out.println("Спасибо за внимание. :) ");
        }
    }
}
