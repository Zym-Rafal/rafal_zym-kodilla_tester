package com.kodilla.inheritance.homework;

public class System1 extends OperatingSystem {

    public System1 (int theYearOfPublishment) {
        super(theYearOfPublishment);
    }

    @Override
    public void turnOn() {
        System.out.println("System1 is turn on");
    }
    @Override
    public void turnOff() {
        System.out.println("System1 is turn off");
    }
}
