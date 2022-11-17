package com.kodilla;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {

    List<Integer> randomNumbers;

    public static void main(String[] args) {
        RandomNumbers rn = new RandomNumbers();
        rn.getRandomNumber();

        System.out.println(rn.getMinNumber());
        System.out.println(rn.getMaxNumber());
        System.out.println(rn.randomNumbers);
    }

    public void getRandomNumber() {
        randomNumbers = new ArrayList<>();
        Random random = new Random();
        int max = 5000;
        int sum = 0;
        while (sum <= max) {
            int randomNumber = random.nextInt(31);
            sum += randomNumber;
            randomNumbers.add(randomNumber);
        }
    }

    public int getMaxNumber() {
        int max = 0;
        for (int value : randomNumbers) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public int getMinNumber() {
        int min = 31;
        for (int value : randomNumbers) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
