package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void polePowierzchni() {
        System.out.println("Pole powierzchni kwadratu to: " + (a * a));
    }

    @Override
    public void obwodPowierzchni() {
        System.out.println("Obwód kwadratu to: " + (4*a));
    }
}
