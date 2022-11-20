package com.kodilla;

import java.util.Random;

public class RandomNumbers {

    private int minNumber = 31;
    private int maxNumber = 0;

    public static void main(String[] args) {
        RandomNumbers rn = new RandomNumbers();
        rn.getRandomNumber();

        System.out.println(rn.getMinNumber());
        System.out.println(rn.getMaxNumber());
    }

    public void getRandomNumber() {
        Random random = new Random();
        int maxSum = 5000;
        int sum = 0;
        while (sum <= maxSum) {
            int randomNumber = random.nextInt(31);
            sum += randomNumber;
            if(randomNumber<minNumber) {
                minNumber = randomNumber;
            }
            if(randomNumber>maxNumber) {
                maxNumber = randomNumber;
            }
        }
    }

    public int getMaxNumber() {
        return this.maxNumber;
    }

    public int getMinNumber() {
        return this.minNumber;
    }
}
