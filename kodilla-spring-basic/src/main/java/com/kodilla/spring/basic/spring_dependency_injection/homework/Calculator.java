package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

   public double add(double a, double b) {
        double resultAdd = a+b;
        Display.display(resultAdd);
        return resultAdd;
   }

    public static double subtract(double a, double b) {
        double resultSubtract = a-b;
        Display.display(resultSubtract);
        return resultSubtract;
    }

   public static double multiply(double a, double b) {
       double resultMultiply = a*b;
       Display.display(resultMultiply);
       return resultMultiply;
   }

    public static double divide(double a, double b) {
        double resultDivide = a/b;
        Display.display(resultDivide);
        return resultDivide;
    }
}
