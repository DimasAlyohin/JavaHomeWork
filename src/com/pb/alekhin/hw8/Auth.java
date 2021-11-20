package com.pb.alekhin.hw8;

import java.util.regex.Pattern;

public class Auth {

    private String login;
    private String password;

    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void signUp(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if(Pattern.matches("[a-zA-Z0-9]{5,20}", login)){
            this.login = login;
        } else {
            throw new WrongLoginException("Логин не соответствует требованиям.");
        }
        if(Pattern.matches("[a-zA-Z0-9_]{5,}", password)){
            this.password = password;
        } else {
            throw new WrongLoginException("Пароль не соответствует требованиям.");
        }
        if(password.equals(confirmPassword)){
        } else {
            throw new WrongLoginException("Пароли не совпадают.");
        }
        System.out.println("Поздравляем! Регистрация прошла успешно.");
    }


    public void signIn(String login1, String password1) throws WrongLoginException, WrongPasswordException {
        if (!this.login.equals(login1)) {
            System.out.println("Логин и/или пароль введен неверно.");
            throw new WrongLoginException();
        } else if (!this.password.equals(password1)) {
            System.out.println("Логин и/или пароль введен неверно.");
            throw new WrongPasswordException();
        } else {
            System.out.println("Вы успешно авторизовались в \"OnlineShop\".");
        }
    }
}