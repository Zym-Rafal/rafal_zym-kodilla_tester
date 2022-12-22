package com.kodilla.collections.adv.maps.homework;

public class Principal {

    private String name;
    private String surname;

    public Principal(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Principal: " + name + " " + surname;
    }
}
