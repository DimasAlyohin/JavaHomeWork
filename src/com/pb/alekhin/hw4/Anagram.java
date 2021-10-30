package com.pb.alekhin.hw4;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String anagram1 = scanner.nextLine();
        String anagram2 = scanner.nextLine();
        System.out.println(myMethod(anagram1, anagram2));
    }
    public static boolean myMethod(String anagram1, String anagram2) {
        anagram1 = anagram1.replaceAll("[^\\dA-Za-zА-ЯЁа-яё0-9]", "");
        anagram2 = anagram2.replaceAll("[^\\dA-Za-zА-ЯЁа-яё0-9]", "");

        if (anagram1.length() == anagram2.length()) {
            String str1 = anagram1.toLowerCase();
            String str2 = anagram2.toLowerCase();
            HashMap<Character, Integer> chars = new HashMap<Character, Integer>(anagram1.length());
            Integer count;
            for (char c : str1.toCharArray()) {
                count = chars.get(c);
                count = Integer.valueOf(count != null ? count + 1 : 1);
                chars.put(c, count);
            }
            for (char c : str2.toCharArray()) {
                count = chars.get(c);
                if (count == null) {
                    return false;
                } else {
                    count--;
                    chars.put(c, count);
                }
            }
            for (Integer i : chars.values()) {
                if (i != 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}