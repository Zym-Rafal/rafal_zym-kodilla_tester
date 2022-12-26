package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    public void testShouldThrowOrderNotFound () {

        // Given
        Warehouse warehouse = new Warehouse();

        // When
        // Then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("2") );




    }

}