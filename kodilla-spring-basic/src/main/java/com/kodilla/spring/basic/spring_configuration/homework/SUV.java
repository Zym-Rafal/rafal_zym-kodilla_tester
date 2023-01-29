package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {

    boolean isLightOn;

    public SUV(boolean isLightOn) {
        this.isLightOn = isLightOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return isLightOn;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }

    @Override
    public void setLightOn(boolean isLightOn) {
        this.isLightOn = isLightOn;
    }
}
