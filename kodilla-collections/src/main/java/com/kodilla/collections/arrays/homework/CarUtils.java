package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Make of car: " + getCarName(car));
        System.out.println("Speed car: " + car.getSpeed());
        System.out.println("-----------------------------");
    }

    private static String getCarName(Car car) {
       if (car instanceof Audi)
           return "Audi";
       else if (car instanceof Bmw)
           return "Bmw";
       else if (car instanceof Mercedes)
           return "Mercedes";
       else
           return "Unknown car name";

    }
}
