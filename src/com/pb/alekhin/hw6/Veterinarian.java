package com.pb.alekhin.hw6;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println("На приёме у ветеринара " + animal.animal + ". Её место обитания: "
                + animal.location + ". Она кушает  " + animal.food);

        return;
    }
}



// Создайте класс Veterinarian (Ветеринар), в котором определите метод void treatAnimal(Animal animal).
// Пусть этот метод печатает на экран food и location пришедшего на прием животного.
// Создайте класс VetСlinic в его методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
// В цикле отправляйте животных на прием к ветеринару.
// Объект класса Veterinarian создайте с помощью рефлексии.