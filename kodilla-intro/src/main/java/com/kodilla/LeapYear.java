package com.kodilla;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0){
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = isLeapYear(2020);
        System.out.println(result);
    }

}