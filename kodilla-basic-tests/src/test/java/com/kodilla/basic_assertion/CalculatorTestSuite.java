package com.kodilla.basic_assertion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.Calculator.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        int a = 5;
        int b = 8;
        int sumResult = sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        int a = 5;
        int b = 8;
        int subtractResult = subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testPowerBelowZero() {
       int a = -2;
       double result = power(a);
       assertEquals(4, result, 0.1);
    }

    @Test
    public void testPowerOfZero() {
        int a = 0;
        double result = power(a);
        assertEquals(0, result, 0.1);
    }

    @Test
    public void testAboveZero() {
        int a = 5;
        double result = power(a);
        assertEquals(25, result, 0.1);
    }
}