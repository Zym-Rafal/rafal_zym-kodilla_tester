package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {

    private double value;
    private LocalDate date;
    private String username;

    public Order(double value, LocalDate date, String username) {
        this.value = value;
        this.date = date;
        this.username = username;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date=" + date +
                ", username='" + username + '\'' +
                '}';
    }
}
