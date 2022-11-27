package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(10);
        square.polePowierzchni();
        square.obwodPowierzchni();

        Rectangle rectangle = new Rectangle(5,10);
        rectangle.polePowierzchni();
        rectangle.obwodPowierzchni();

        Triangle triangle = new Triangle(10,15,20,16);
        triangle.polePowierzchni();
        triangle.obwodPowierzchni();
    }
}
