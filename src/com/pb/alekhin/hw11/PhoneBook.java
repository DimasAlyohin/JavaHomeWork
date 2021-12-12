package com.pb.alekhin.hw11;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Function;

public class PhoneBook {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        List<Contact> contacts = new ArrayList<>();

        SimpleModule module1 = new SimpleModule();
        module1.addSerializer(LocalDate.class, new LocalDateSerializer());
        module1.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module1);

        SimpleModule module2 = new SimpleModule();
        module2.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        module2.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        mapper.registerModule(module2);

        System.out.println("*ТЕЛЕФОННАЯ КНИГА*");

            while (true) {
                System.out.println("Выберите действие:");
                System.out.println("добавить новый контакт - \"+\"");
                System.out.println("удалить контакт - \"delete\"");
                System.out.println("редактирование - \"edit\"");
                System.out.println("поиск - \"search\"");
                System.out.println("сортировка списка - \"sort\"");
                System.out.println("запись списка контактов в файл  - \"write\"");
                System.out.println("считывание информации из файла - \"read\"");
                Scanner act = new Scanner(System.in);
                String a = act.nextLine();
                String action = a.toLowerCase();
                switch (action) {
                    case "+":
                        System.out.println("введите имя:");
                        String name = act.nextLine();
                        System.out.println("введите номер телефона");
                        String number = act.nextLine();
                        System.out.println("введите адрес");
                        String address = act.nextLine();
                        while (true) {
                            System.out.println("введите дату рождения:");
                            System.out.println("год:");
                            int year = act.nextInt();
                            System.out.println("месяц:");
                            int month = act.nextInt();
                            System.out.println("день:");
                            int day = act.nextInt();
                            try {
                                contacts.add(new Contact(name, LocalDate.of(year, month, day), number, address, LocalDateTime.now()));
                                System.out.println("новый контакт сохранён");
                                break;
                            } catch (DateTimeException ex) {
                                System.out.println("*дата введена некорректно (month max - 12 / day max - 31)*");
                            }
                        }
                        break;
                    case "delete": {
                        System.out.println("введите имя или номер контакта для удаления");
                        String d = act.nextLine();
                        String delete = d.toLowerCase();
                        Iterator<Contact> iterator = contacts.iterator();
                        while (iterator.hasNext()) {
                            Contact contact = iterator.next();
                            if (delete.equals(contact.getName().toLowerCase()) || delete.equals(contact.getNumber())) {
                                iterator.remove();
                                System.out.println("*контакт " + contact.getName() + " успешно удалён*");
                                break;
                            }
                        }
                        break;
                    }
                    case "edit": {
                        System.out.println("введите имя или номер для поиска контакта который нужно редактировать");
                        String s = act.nextLine();
                        String search = s.toLowerCase();
                        for (Contact contact : contacts) {
                            if (search.equals(contact.getName().toLowerCase()) || search.equals(contact.getNumber())) {
                                System.out.println("*контакт найден*");
                                String contactJson = mapper.writeValueAsString(contact);
                                System.out.println(contactJson);
                                System.out.println("введите параметр который нужно изменить (name/birth/number/address)");
                                String e = act.nextLine();
                                String edit = e.toLowerCase();
                                switch (edit) {
                                    case "name":
                                        System.out.println("введите новое имя");
                                        String newName = act.nextLine();
                                        contact.setName(newName);
                                        break;
                                    case "number":
                                        System.out.println("введите новый номер");
                                        String newNumber = act.nextLine();
                                        contact.setNumber(newNumber);
                                        break;
                                    case "address":
                                        System.out.println("введите новый адрес");
                                        String newAddress = act.nextLine();
                                        contact.setAddress(newAddress);
                                        break;
                                    case "birth":
                                        while (true) {
                                            System.out.println("введите новую дату рождения");
                                            System.out.println("год:");
                                            int newYear = act.nextInt();
                                            System.out.println("мсяц:");
                                            int newMonth = act.nextInt();
                                            System.out.println("день:");
                                            int newDay = act.nextInt();
                                            try {
                                                contact.setBirth(LocalDate.of(newYear, newMonth, newDay));
                                                break;
                                            } catch (DateTimeException ex) {
                                                System.out.println("дата введена некорректно (month max - 12 / day max - 31)");
                                            }

                                        }
                                    default:
                                        System.out.println("такого параметра не существует");
                                        break;
                                }
                                System.out.println("*изменения сохранены*");
                                contact.setEditTime(LocalDateTime.now());
                                String editContactJson = mapper.writeValueAsString(contact);
                                System.out.println(editContactJson);
                            }
                        }
                        break;
                    }
                    case "search": {
                        System.out.println("введите имя или номер для поиска");
                        String s = act.nextLine();
                        String search = s.toLowerCase();
                        Iterator<Contact> iterator = contacts.iterator();
                        while (iterator.hasNext()) {
                            Contact contact = iterator.next();
                            if (search.equals(contact.getName().toLowerCase()) || search.equals(contact.getNumber())) {
                                System.out.println("*контакт найден*");
                                String contactJson = mapper.writeValueAsString(contact);
                                System.out.println(contactJson);
                                break;
                            }
                        }
                        break;
                    }
                    case "sort": {
                        System.out.println("Выберите критерий сортировки: (name/birth/editTime)");
                        String s = act.nextLine();
                        String sort = s.toLowerCase();
                        switch (sort) {
                            case "name":
                                contacts.sort(Comparator.comparing(new Function<Contact, String>() {
                                    @Override
                                    public String apply(Contact c) {
                                        return c.getName();
                                    }
                                }));
                                break;
                            case "birth":
                                contacts.sort(Comparator.comparing(new Function<Contact, LocalDate>() {
                                    @Override
                                    public LocalDate apply(Contact c) {
                                        return c.getBirth();
                                    }
                                }));
                                break;
                            case "editTime":
                                contacts.sort(Comparator.comparing(new Function<Contact, LocalDateTime>() {
                                    @Override
                                    public LocalDateTime apply(Contact c) {
                                        return c.getEditTime();
                                    }
                                }));
                                break;
                            default:
                                System.out.println("Эта функция еще не разработана");
                                break;
                        }
                        break;
                    }
                    case "write":
                        System.out.println("запись в файл...");
                        try (Writer writer = new FileWriter("C:/Users/User/IdeaProjects/JavaHomeWork/files/Phone_book.txt")) {
                            String contactJson = mapper.writeValueAsString(contacts);
                            writer.write(contactJson);
                            System.out.println("файл записан");
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        break;
                    case "read":
                        System.out.println("считывание файла...");
                        try (BufferedReader reader = Files.newBufferedReader(Paths.get("C:/Users/User/IdeaProjects/JavaHomeWork/files/Phone_book.txt"))) {
                            String line;
                            while ((line = reader.readLine()) != null) {
                                System.out.println(line);
                            }
                            System.out.println("файл считан");
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        break;
                    default:
                        System.out.println("Эта функция еще не разработана");
                        break;
                }
            }

    }
}

