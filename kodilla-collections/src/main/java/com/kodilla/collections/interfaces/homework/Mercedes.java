package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car {
    private int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 90;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 70;
    }
}
