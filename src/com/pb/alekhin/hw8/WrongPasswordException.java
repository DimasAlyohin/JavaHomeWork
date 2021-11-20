package com.pb.alekhin.hw8;

public class WrongPasswordException extends Exception{

    public WrongPasswordException(String msg) {
        super(msg);
    }

    public WrongPasswordException() {
    }
}