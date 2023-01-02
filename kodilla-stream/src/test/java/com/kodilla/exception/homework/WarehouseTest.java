package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    public void testShouldThrowOrderNotFound() {

        // Given
        Warehouse warehouse = new Warehouse();

        // When
        // Then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("2") );
    }

    @Test
    public void testShouldOrderBeProperlyReturned() throws OrderDoesntExistException {
        // Given
        Warehouse warehouse = new Warehouse();
        Order order = new Order("105");
        warehouse.addOrder(order);

        // When
        Order result = warehouse.getOrder("105");

        //Then
        assertEquals(order, result);
    }
}