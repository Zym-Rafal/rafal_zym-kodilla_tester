package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void polePowierzchni() {
        System.out.println("Pole powierzchni prostokąta to: " + (a * b));
    }

    @Override
    public void obwodPowierzchni() {
        System.out.println("Obwód prostokąta to: " + (2*a + 2*b));
    }
}
