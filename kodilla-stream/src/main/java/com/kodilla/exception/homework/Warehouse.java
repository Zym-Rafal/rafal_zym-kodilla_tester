package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        List<Order> result = orders.stream()
                .filter(order -> order.getNumber().equals(number))
                .collect(Collectors.toList());

        if (result.size() > 0) {
            return result.get(0);
        }
        throw new OrderDoesntExistException();
    }
}
