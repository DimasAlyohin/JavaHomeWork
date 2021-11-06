package com.pb.alekhin.hw6;

import java.util.Objects;

public class Horse extends Animal{

    public double jump;                     // высота прыжка
    public int races;                       // количество забегов
    public String noise;

    public Horse(String food, String location, String animal, double jump, int races, String noise) {
        super(food, location, animal);
        this.jump = jump;
        this.races = races;
        this.noise = noise;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" *бьёт копитом*");
    }
    @Override
    public void makeNoise() {
        System.out.println(animal + " говорит " + noise);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Double.compare(horse.jump, jump) == 0 && races == horse.races && Objects.equals(noise, horse.noise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jump, races, noise);
    }

    @Override
    public String toString() {
        return animal +
                " (еда - '" + food + '\'' +
                ", место обитания - '" + location + '\'' +
                ", высота прыжка - '" + jump + " м" + '\'' +
                ", количество забегов - '" + races + '\'' +
                ", голос - '" + noise + '\'' +
                ')';
    }
}
