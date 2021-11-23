package com.pb.alekhin.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileNumbers {
    public static void main(String[] args) {
        createNumbersFile();
        createOddNumbersFile();
    }

    public static void createNumbersFile() {

        Path path = Paths.get("C:/Users/User/IdeaProjects/JavaHomeWork/files/numbers.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            int[][] a = new int[10][10];   // {x,y,x,y,x,y,x,y,x,y};
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = ((int) (Math.random() * 99 + 1));
                    writer.write(a[i][j] + " ");
                }
                writer.newLine();
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }

        public static void createOddNumbersFile() {
            try (Scanner scan = new Scanner(new File("C:/Users/User/IdeaProjects/JavaHomeWork/files/numbers.txt"))) {
                Path path2 = Paths.get("C:/Users/User/IdeaProjects/JavaHomeWork/files/odd-numbers.txt");
                BufferedWriter bw = Files.newBufferedWriter(path2);
                while (scan.hasNextLine()) {
                    Scanner sc = new Scanner(scan.nextLine());
                    while (sc.hasNextInt()) {
                        int i = sc.nextInt();
                        if (i % 2 == 0) {
                            i = 0;
                        }
                        bw.write(i + " ");
                    }
                    sc.close();
                    bw.newLine();
                }
                System.out.println();
                bw.close();
            } catch (Exception ex) {
                System.out.println("Error: " + ex);
        }
    }
}
