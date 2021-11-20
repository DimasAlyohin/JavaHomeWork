package com.pb.alekhin.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        String login;
        String login1;
        String password;
        String password1;
        String confirmPassword;

        System.out.println("Приветствуем вас в \"OnlineShop\"!");
        System.out.println("Для регистрации придумайте логин:");
        System.out.println("(логин должен быть от 5 до 20 символов и может содержать цифры и латинские буквы)");
        Scanner log = new Scanner(System.in);
        login = log.nextLine();
        System.out.println("Придумайте пароль:");
        System.out.println("(пароль должен быть не менее 5 символов и может содержать цифры, латинские буквы и знак \"_\")");
        Scanner pas = new Scanner(System.in);
        password = pas.nextLine();
        Scanner cPas = new Scanner(System.in);
        System.out.println("Повторите пароль:");
        confirmPassword = cPas.nextLine();

        Auth user = new Auth(login, password);

        try {
            user.signUp(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return;
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("--------------------");
        final int MAX_ATTEMPT = 3;
        int attempt = 0;
        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Для авторизации в \"OnlineShop\" введите логин:");
        Scanner log1 = new Scanner(System.in);
        login1 = log1.nextLine();
        System.out.println("Введите пароль:");
        Scanner pas1 = new Scanner(System.in);
        password1 = pas1.nextLine();

        try {
            user.signIn(login1, password1);
        } catch (WrongLoginException | WrongPasswordException e) {
            if (attempt < 3)
                continue;
            if (attempt == 3)
                System.out.println("Аккаунт заблокирован.");
            break;
        }
    }
    }
}
