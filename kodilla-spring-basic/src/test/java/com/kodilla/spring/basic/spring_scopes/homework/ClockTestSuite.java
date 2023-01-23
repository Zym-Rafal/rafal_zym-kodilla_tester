package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void test() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Clock firstBean = context.getBean(Clock.class);
        Thread.sleep(500);
        Clock secondBean = context.getBean(Clock.class);
        Thread.sleep(500);
        Clock thirdBean = context.getBean(Clock.class);

        assertNotEquals(firstBean.getTime(), secondBean.getTime());
        assertNotEquals(secondBean.getTime(), thirdBean.getTime());
        assertNotEquals(thirdBean.getTime(), firstBean.getTime());
    }
}