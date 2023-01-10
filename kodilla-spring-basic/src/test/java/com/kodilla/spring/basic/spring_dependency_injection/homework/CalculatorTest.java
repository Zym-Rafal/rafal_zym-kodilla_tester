package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class CalculatorTest {

    @Autowired
    private Calculator calculator;


    @Test
    public void testAdd() {
        double result = calculator.add(5,10);
        Assertions.assertEquals(15,result);
    }

    @Test
    public void testSubtract() {
        double result = calculator.subtract(15,10);
        Assertions.assertEquals(5,result);
    }

    @Test
    public void testMultiply() {
        double result = calculator.multiply(5,10);
        Assertions.assertEquals(50,result);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(20,10);
        Assertions.assertEquals(2,result);
    }
}