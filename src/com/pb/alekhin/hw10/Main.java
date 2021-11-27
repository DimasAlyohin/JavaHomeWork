package com.pb.alekhin.hw10;

public class Main {
    public static void main(String[] args) {

        NumBox<Integer> numbers = new NumBox<>(5);
        try {
            System.out.println("*****************************");
            System.out.println("***Наполнение масива Integer***");
            System.out.println("*****************************\n");
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(6);
        } catch (Exception e) {
            System.out.println("Больше нельзя добавлять элементы. Массив переполнен!\n");
        }

        System.out.println("Под запрашиваемым индексом записан элемент \"" + numbers.get(1) + "\"");
        System.out.println("\nВ массив добавлено вот столько элементов - " + numbers.length());
        System.out.println("\nСреднее арифметическое элементов массива = " + numbers.average());
        System.out.println("\nСумма элементов массива = " + numbers.sum());
        System.out.println("\nЭлемент с максимальним значением в массиве - " + numbers.max());

        System.out.println(" ");
        NumBox<Float> numbers2 = new NumBox<>(5);
        try {
            System.out.println("*****************************");
            System.out.println("***Наполнение масива Float***");
            System.out.println("*****************************\n");
            numbers2.add(1.1f);
//            numbers2.add(2.2f);
//            numbers2.add(3.3f);
//            numbers2.add(4.4f);
//            numbers2.add(5.5f);
//            numbers2.add(6.6f);
        } catch (Exception e) {
            System.out.println("Больше нельзя добавлять элементы. Массив переполнен!\n");
        }
        System.out.println("Под запрашиваемым индексом записан элемент \"" + numbers2.get(0) + "\"");
        System.out.println("\nВ массив добавлено вот столько элементов - " + numbers2.length());
        System.out.println("\nСреднее арифметическое элементов массива = " + numbers2.average());
        System.out.println("\nСумма элементов массива = " + numbers2.sum());
        System.out.println("\nЭлемент с максимальним значением в массиве - " + numbers2.max() + "f");
    }

}
