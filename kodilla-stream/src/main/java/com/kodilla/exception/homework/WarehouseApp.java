package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("100"));
        warehouse.addOrder(new Order("101"));
        warehouse.addOrder(new Order("102"));
        warehouse.addOrder(new Order("103"));
        warehouse.addOrder(new Order("104"));

        try {
            Order order = warehouse.getOrder("2");
            System.out.println("Order found. No. " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Order not found");
        }
    }

}
