package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {

    boolean isLightOn;

    public Cabrio(boolean isLightOn) {
        this.isLightOn = isLightOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return false;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }

    @Override
    public void setLightOn(boolean isLightOn) {
        this.isLightOn = isLightOn;
    }
}
