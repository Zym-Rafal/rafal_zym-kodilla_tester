package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    Shop shop = new Shop();
    Order order1 = new Order(120.50, LocalDate.of(2021,1,18),"qwerty1");
    Order order2 = new Order(50, LocalDate.of(2022,12,23),"qwerty2");
    Order order3 = new Order(99, LocalDate.of(2022,2,28),"qwerty3");
    Order order4 = new Order(12.56, LocalDate.of(2020,4,2),"qwerty4");
    Order order5 = new Order(120.52, LocalDate.of(2019,10,12),"qwerty5");
    Order order6 = new Order(76.72, LocalDate.of(2016,8,5),"qwerty6");
    Order order7 = new Order(120.52, LocalDate.of(2018,8,7),"qwerty7");

    @BeforeEach
     public void addOrders() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
        shop.addOrder(order7);
    }

    @Test
    public void shouldAddOrdersToList() {
        int numberOfOrders = shop.getSize();
        assertEquals(7,numberOfOrders);
    }

    @Test
    public void shouldReturnOrdersUnderTwoYear() {
        Set<Order> result = shop.ordersUnderTwoYears();
        assertEquals(3, result.size());
        Set<LocalDate> collect = result.stream()
                .map(order -> order.getDate())
                .collect(Collectors.toSet());
        assertTrue(collect.containsAll(List.of(LocalDate.of(2021,1,18))));
        assertTrue(collect.containsAll(List.of(LocalDate.of(2022,12,23))));
        assertTrue(collect.containsAll(List.of(LocalDate.of(2022,2,28))));
    }

    @Test
    public void shouldReturnSumValuesAllOrders() {
        double result = shop.sumAllOrders();
        assertEquals(599.82,result,0.01);
    }

    @Test
    public void shouldReturnMinAndMaxValueOrders() {
       Set<Order> result = shop.getOrdersFromGivenRange(40,100);
       assertEquals(3,result.size());
        Set<Double> collect = result.stream()
                .map(order -> order.getValue())
                .collect(Collectors.toSet());
        assertTrue(collect.containsAll(List.of(50.0,99.0,76.72)));
    }
}