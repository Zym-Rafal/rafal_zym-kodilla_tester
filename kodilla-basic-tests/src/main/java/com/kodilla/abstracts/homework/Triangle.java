package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

    private int a;
    private int b;
    private int c;
    private int h;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public void polePowierzchni() {
        System.out.println("Pole powierzchni trójkąta to: " + (a*h / 2));
    }

    @Override
    public void obwodPowierzchni() {
        System.out.println("Obwód trójkąta to: " + (a + b + c));
    }
}
