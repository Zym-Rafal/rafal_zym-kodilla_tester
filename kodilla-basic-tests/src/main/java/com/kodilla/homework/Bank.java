package com.kodilla.homework;

public class Bank {

    private CashMachine[] cashMachines;

    public Bank(CashMachine... cashMachines) {
        this.cashMachines = cashMachines;
    }

    public double getTotalAmountOfCashInAllCashMachines() {
        double totalAmount = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalAmount = totalAmount + cashMachine.getBalance();
        }
        return totalAmount;
    }

    public double getSumOfWithdrawals() {
        double sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum = sum + cashMachine.getSumOfWithdraws();
        }
        return sum;
    }

    public double getSumOfDeposits() {
        double sum = 0;
        for (CashMachine cashMachine : cashMachines) {
          sum = sum + cashMachine.getSumOfDeposits();
        }
        return sum;
    }

    public double getNumberOfWithdrawals() {
        double numberOfWithdraws = 0;
        for (CashMachine cashMachine : cashMachines) {
            numberOfWithdraws = numberOfWithdraws + cashMachine.getNumberOfWithdraws();
        }
        return numberOfWithdraws;
    }

    public double getNumberOfDeposits() {
        double numberOfDeposits = 0;
        for (CashMachine cashMachine : cashMachines) {
          numberOfDeposits = numberOfDeposits + cashMachine.getNumberOfDeposits();
        }
        return numberOfDeposits;
    }

    public double getAverageValueOfWithdrawals() {
        return getSumOfWithdrawals()/getNumberOfWithdrawals();
    }

    public double getAverageValueOfDeposits() {
        return getSumOfDeposits()/getNumberOfDeposits();
    }
}
