package com.kodilla.inheritance.homework;

public class System2 extends OperatingSystem {

    public System2 (int theYearOfPublishment) {
        super(theYearOfPublishment);
    }

    @Override
    public void turnOn() {
        System.out.println("System2 is turn on");
    }
    @Override
    public void turnOff() {
        System.out.println("System2 is turn off");
    }
}
