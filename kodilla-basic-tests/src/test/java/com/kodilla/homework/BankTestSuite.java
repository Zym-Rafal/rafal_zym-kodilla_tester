package com.kodilla.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BankTestSuite {

    private static Bank bank;
    private static CashMachine cashMachine1;
    private static CashMachine cashMachine2;
    private static CashMachine cashMachine3;

    @BeforeAll
    public static void setup() {
        cashMachine1 = new CashMachine(500,200,-300);
        cashMachine2 = new CashMachine(400,300,-800);
        cashMachine3 = new CashMachine(-500,-200,-200, 800);
        bank = new Bank(cashMachine1, cashMachine2, cashMachine3);
    }

    @Test
    public void shouldReturnTotalAmountOfCashInAllCashMachines() {
        Assertions.assertEquals(200, bank.getTotalAmountOfCashInAllCashMachines());
    }

    @Test
    public void shouldReturnTotalAmountOfWithdrawals() {
        Assertions.assertEquals(2000, bank.getSumOfWithdrawals());
    }

    @Test
    public void shouldReturnTotalAmountOfDeposits() {
        Assertions.assertEquals(2200, bank.getSumOfDeposits());
    }

    @Test
    public void shouldReturnAverageValueOfDeposits() {
        Assertions.assertEquals(440, bank.getAverageValueOfDeposits());
    }

    @Test
    public void shouldReturnAverageValueOfWithdrawals() {
        Assertions.assertEquals(400, bank.getAverageValueOfWithdrawals());
    }
}
