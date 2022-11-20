package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int theYearOfPublishment;

    public OperatingSystem(int theYearOfPublishment) {
        this.theYearOfPublishment = theYearOfPublishment;
    }

    public void turnOn() {
        System.out.println("Operating system is turn on");
    }



    public void turnOff() {
        System.out.println("Operating system is turn off");

    }

    public int getYear() {
        return theYearOfPublishment;
    }
}
