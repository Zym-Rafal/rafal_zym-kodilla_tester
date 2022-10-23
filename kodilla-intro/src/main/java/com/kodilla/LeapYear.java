package com.kodilla;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2022;

        if (year % 4 == 0) {
            System.out.println("rok przestępny");
        } else {
            System.out.println("rok nieprzestępny");
        }


    }

}