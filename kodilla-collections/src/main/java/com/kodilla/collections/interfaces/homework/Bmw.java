package com.kodilla.collections.interfaces.homework;

public class Bmw implements Car {
    private int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 80;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 60;
    }
}

