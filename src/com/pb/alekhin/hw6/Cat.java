package com.pb.alekhin.hw6;

import java.util.Objects;

public class Cat extends Animal{

    public int сolor;                       // количество цветов окраса
    public int mouses;                      // количество пойманых мышей в месяц
    public String noise;

    public Cat(String food, String location, String animal, int сolor, int mouses, String noise) {
        super(food, location, animal);
        this.сolor = сolor;
        this.mouses = mouses;
        this.noise = noise;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" *мурчит*");
    }
    @Override
    public void makeNoise() {
        System.out.println(animal + " говорит " + noise);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return сolor == cat.сolor && mouses == cat.mouses && Objects.equals(noise, cat.noise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(сolor, mouses, noise);
    }
    @Override
    public String toString() {
        return animal +
                " (еда - '" + food + '\'' +
                ", место обитания - '" + location + '\'' +
                ", количество цветов окраса - '" + сolor + '\'' +
                ", количество пойманых мышей - '" + mouses + '\'' +
                ", голос - '" + noise + '\'' +
                ')';
    }
}
