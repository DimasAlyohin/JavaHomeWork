package com.pb.alekhin.hw6;

public class Animal {

    public String animal;
    public String food;
    public String location;

    public Animal(String food, String location, String animal) {
        this.animal = animal;
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("издаёт звуки");
    }

    public void eat() {
        System.out.println(animal + " кушает " + food);
    }

    public String sleep() {
        return animal + " спит";
    }
}
