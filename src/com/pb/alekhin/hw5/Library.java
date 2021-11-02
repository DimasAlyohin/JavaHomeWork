package com.pb.alekhin.hw5;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Иванов И.И.", 1, "Финансы", "10.01.2001г.", "+380631234567");
        readers[1] = new Reader("Петров П.П.", 2, "Программирование", "20.02.2002", "+380661234567");
        readers[2] = new Reader("Сидоров С.С.", 3, "Математика", "30.03.2003", "+380671234567");

        Book[] books = new Book[3];
        books[0] = new Book("Приключения", "Иванин", 2001);
        books[1] = new Book("Словарь", "Петровин", 2002);
        books[2] = new Book("Энциклопедия", "Сидоровин", 2003);

        System.out.println("Список читателей:");
        System.out.println("1. " + readers[0].getInfo());
        System.out.println("2. " + readers[1].getInfo());
        System.out.println("3. " + readers[2].getInfo());
        System.out.println("Список книг:");
        System.out.println("1. " + books[0].getInfo());
        System.out.println("2. " + books[1].getInfo());
        System.out.println("3. " + books[2].getInfo());


        System.out.println("*Читатель зашел в библиотеку*");
        readers[1].takeBook(3);

        readers[1].takeBook(books[0], books[1], books[2]);

        readers[1].takeBook(books[0], books[0], books[0], books[1], books[1], books[1], books[2], books[2], books[2]);
        System.out.println("*a few moment later*");
        readers[1].returnBook(3);

        readers[1].returnBook(books[0], books[1], books[2]);

        readers[1].returnBook(books[0], books[0], books[0], books[1], books[1], books[1], books[2], books[2], books[2]);


    }

}
