package com.kodilla.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    private static CashMachine cashMachine;

    @BeforeAll
    public static void setup() {
        cashMachine = new CashMachine(1000, 100, 200, -50);
    }

    @Test
    public void shouldReturnAmount() {
        assertEquals(1250, cashMachine.getAmount());
    }

    @Test
    public void shouldReturnQuantityOfTransactions() {
        assertEquals(3, cashMachine.getQuantityOfTransactions());
    }

    @Test
    public void shouldReturnTransactions() {
        assertEquals(100, cashMachine.getTransactions()[0]);
        assertEquals(200, cashMachine.getTransactions()[1]);
        assertEquals(-50, cashMachine.getTransactions()[2]);
    }
}
