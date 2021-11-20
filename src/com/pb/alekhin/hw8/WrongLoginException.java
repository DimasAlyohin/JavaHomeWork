package com.pb.alekhin.hw8;

public class WrongLoginException extends Exception{

    public WrongLoginException(String msg) {
        super(msg);
    }

    public WrongLoginException() {
    }
}