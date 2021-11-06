package com.pb.alekhin.hw6;

import java.util.Objects;

public class Dog extends Animal{

    public int speed;                   // скорость км/ч
    public String breed;                // порода
    public String noise;

    public Dog(String food, String location, String animal, int speed, String breed, String noise) {
        super(food, location, animal);
        this.speed = speed;
        this.breed = breed;
        this.noise = noise;
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println(" *рычит*");
    }

    @Override
    public void makeNoise() {
        System.out.println(animal + " говорит " + noise);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return speed == dog.speed && Objects.equals(breed, dog.breed) && Objects.equals(noise, dog.noise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, breed, noise);
    }

    @Override
    public String toString() {
        return animal +
                " (еда - '" + food + '\'' +
                ", место обитания - '" + location + '\'' +
                ", скорость - '" + speed + " км/час" + '\'' +
                ", порода - '" + breed + '\'' +
                ", голос - '" + noise + '\'' +
                ')';
    }
}