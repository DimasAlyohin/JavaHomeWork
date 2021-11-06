package com.pb.alekhin.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws Exception {

        Animal[] animals = new Animal[5];
    animals[0] = new Cat("корм", "дом", "кошка", 1, 5, "мяу");
    animals[1] = new Cat("мышь", "дом", "кошка", 2, 10, "мяу");
    animals[2] = new Dog("мясо", "будка", "собака", 15, "доберман", "гав");
    animals[3] = new Dog("мясо", "будка", "собака", 15, "доберман", "гав");
    animals[4] = new Horse("сено", "конюшня", "лошадь", 1.5,37, "и-го-го");

    animals[0].eat();
        System.out.println(animals[0].sleep());
        animals[2].eat();

        animals[4].makeNoise();

        System.out.println("eq cats: " + animals[0].equals(animals[1]));
        System.out.println("eq dogs: " + animals[2].equals(animals[3]));

        System.out.println(animals[2]);
        System.out.println(animals[0]);
        System.out.println(animals[4]);

        System.out.println("                    ");


        Veterinarian vet = new Veterinarian();
        Class clazz = vet.getClass();

        Class vetClazz = Class.forName("com.pb.alekhin.hw6.Veterinarian");

        Constructor constr = vetClazz.getConstructor();
        Object obj = constr.newInstance();
        String[] s = new String[animals.length];
        if (obj instanceof Veterinarian)
            for (int i = 0; i < animals.length ;i++) {
                ((Veterinarian) obj).treatAnimal(animals[i]);
            }
    }
}
