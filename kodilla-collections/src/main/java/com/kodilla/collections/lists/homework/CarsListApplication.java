package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.ShapeUtils;
import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Audi audi = new Audi();
        cars.add(audi);
        cars.add(new Bmw());
        cars.add(new Mercedes());

        cars.remove(1);
        cars.remove(audi);

        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}

