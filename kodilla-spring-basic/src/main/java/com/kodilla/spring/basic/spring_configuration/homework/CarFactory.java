package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Time;
import java.util.Random;

@Configuration
public class CarFactory {

    @Bean
    public String getRandomSeason() {
        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        Random generator = new Random();
        int chosen = generator.nextInt(4);
        return seasons[chosen];
    }

    @Bean
    public Car getCarBySeason(String season) {
        Car car = null;
        boolean shouldLightsBeOn = shouldLightsBeOn(getRandomTime());
        switch (season) {
            case "Winter":
                car = new SUV(shouldLightsBeOn);
                break;
            case "Summer":
                car = new Cabrio(shouldLightsBeOn);
                break;
            case "Spring":
            case "Autumn":
                car = new Sedan(shouldLightsBeOn);
                break;
        }
        return car;
    }

    private Time getRandomTime() {
        Random generator = new Random();
        final int millisInDay = 24*60*60*1000;
        long chosen = (long) generator.nextInt(millisInDay);
        return new Time(chosen);
    }

    private boolean shouldLightsBeOn(Time time) {
        if(time.getHours() > 20 || time.getHours() < 6)
            return true;
        else return false;
    }

    @Bean
    public Car createRandomCar () {
        Car car = getCarBySeason(getRandomSeason());
        car.setLightOn(shouldLightsBeOn(getRandomTime()));
        return car;
    }
}
