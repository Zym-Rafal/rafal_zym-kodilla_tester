package com.kodilla;

import java.util.Scanner;

public class FirstLetterUserDialogs {

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Select first letter of color (Y - Yellow, B- Blue, G - Green, R - red, P - Purple, W - White):");
            String showFullNameOfColor = scanner.nextLine().trim().toUpperCase();
            switch (showFullNameOfColor) {
                case "Y" : return "Yellow";
                case "B" : return "Blue";
                case "G" : return "Green";
                case "R" : return "Red";
                case "P" : return "Purple";
                case "W" : return "White";
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        String result = FirstLetterUserDialogs.getUserSelection();
        System.out.println("Result: " + result);
    }

}
