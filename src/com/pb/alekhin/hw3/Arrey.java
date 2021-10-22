package com.pb.alekhin.hw3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrey {
    public static void main(String[] args) {
        int[] masiv = new int[10];{

            System.out.println("Придумайте 10 любых чисел, больше меньше или равных 0:");
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

            for (int i = 0; i < masiv.length; i++) {
                System.out.println(masiv[i]);


            }

        }
    }
}
