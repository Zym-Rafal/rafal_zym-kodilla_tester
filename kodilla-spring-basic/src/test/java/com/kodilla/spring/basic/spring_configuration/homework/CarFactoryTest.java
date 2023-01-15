package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Time;
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
    @Test
    public void shouldLightBeOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        boolean result = (boolean) context.getBean("shouldLightsBeOn", new Time(5,45,45));
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldLightBeOff() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        boolean result = (boolean) context.getBean("shouldLightsBeOn", new Time(13,35,15));
        Assertions.assertFalse(result);
    }
}