package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.Random;

public class CarsApplication {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for(int i = 0; i< cars.length; i++)
            cars[i] =drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        int randomNumber = random.nextInt(3);
        Car randomCar;

        if(randomNumber == 0) {
            randomCar = new Audi();
        } else if (randomNumber == 1) {
            randomCar = new Bmw();
        } else {
            randomCar = new Mercedes();
        }

        int randomIncrease = random.nextInt(5)+1;

        for(int i=0; i < randomIncrease; i++) {
            randomCar.increaseSpeed();
        }
        return randomCar;
    }

}
