package com.pb.alekhin.hw10;

public class NumBox <T extends Number> {

    private final T[] numbers;
    private int filled;

    @SuppressWarnings("unchecked")
    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }

    public void add(T num) throws Exception {
        if(filled > numbers.length){
            throw new Exception();
        }
        numbers[filled] = num;
        System.out.println("В массив добавлен элемент \"" + num + "\".");
        filled++;
    }

    public T get(int index) {
        if (numbers[index] != null) {
        } else {
            System.out.println("\nЗапрашиваемого элемента не существует. Или по другому можно сказать так:");
        }
        return numbers[index];
    }

    public int length() {
        return filled;
    }

    public double average() {
        double average = 0;
        for (int i = 0; i < filled; i++) {
            average += numbers[i].doubleValue();
        }
        average /= filled;
        return average;
    }

    public double sum() {
        double sum = 0;
        for (T num : numbers) {
            if (num != null) {
                sum += num.doubleValue();
            }
        }
        return sum;
    }

    public T max() {
        T maximum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != null) {
                if (numbers[i].intValue() > maximum.intValue()) {
                    maximum = numbers[i];
                }
            }
        }
        return maximum;
    }
}
