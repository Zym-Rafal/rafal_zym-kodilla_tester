package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarFactoryTest {

    @Test
    public void shouldCreateRandomCar() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("createRandomCar");
        String randomCar = car.getCarType();
        System.out.println(randomCar);
        List<String> possibleTypeOfCar = Arrays.asList("SUV", "Cabrio", "Sedan");
        Assertions.assertTrue(possibleTypeOfCar.contains(randomCar));
    }

    @Test
    public void shouldReturnRandomSeason() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        String season = (String) context.getBean("getRandomSeason");
        System.out.println(season);
        List<String> possibleSeason = Arrays.asList("Winter", "Spring", "Summer", "Autumn");
        Assertions.assertTrue(possibleSeason.contains(season));
    }
}
