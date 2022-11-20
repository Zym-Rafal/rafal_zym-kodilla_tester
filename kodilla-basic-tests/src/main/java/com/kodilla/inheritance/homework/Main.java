package com.kodilla.inheritance.homework;



public class Main {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1999);
        System.out.println(operatingSystem.getYear());
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        System1 system1 = new System1(2001);
        System.out.println(system1.getYear());
        system1.turnOn();
        system1.turnOff();

        System2 system2 = new System2(2005);
        System.out.println(system2.getYear());
        system2.turnOn();
        system2.turnOn();



    }
}