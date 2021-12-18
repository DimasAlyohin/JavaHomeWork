package com.pb.alekhin.hw12;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Contact {

    private String name;
    private LocalDate birth;
    private String number;
    private String address;
    private LocalDateTime editTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getEditTime() {
        return editTime;
    }

    public void setEditTime(LocalDateTime editTime) {
        this.editTime = editTime;
    }

    public Contact(String name, LocalDate birth, String number, String address, LocalDateTime editTime) {
        this.name = name;
        this.birth = birth;
        this.number = number;
        this.address = address;
        this.editTime = editTime;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                ", number='" + number + '\'' +
                ", address='" + address + '\'' +
                ", editTime=" + editTime +
                '}';
    }
}
