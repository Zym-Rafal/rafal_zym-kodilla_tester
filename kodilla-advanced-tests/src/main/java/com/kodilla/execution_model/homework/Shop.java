package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Set<Order> ordersUnderTwoYears() {
        return orders.stream()
                .filter(this::isOrderUnderTwoYears)
                .collect(Collectors.toSet());
    }

    public Set<Order> getOrdersFromGivenRange(double min, double max) {
       return orders.stream()
                .filter(order -> order.getValue() >= min)
                .filter(order -> order.getValue() <= max)
                .collect(Collectors.toSet());
    }

    private boolean isOrderUnderTwoYears(Order order) {
        LocalDate dateTwoYearsAgo = LocalDate.now().minusYears(2);
        return order.getDate().isAfter(dateTwoYearsAgo);
    }

    public int getSize() {
        return this.orders.size();
    }

    public double sumAllOrders() {
        return orders.stream()
                .mapToDouble(Order::getValue)
                .sum();
    }

    @Override
    public String toString() {
        return "Shop{" +
                "orders=" + orders +
                '}';
    }
}
