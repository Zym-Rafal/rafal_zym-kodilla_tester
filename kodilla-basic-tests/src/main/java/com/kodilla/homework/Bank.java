package com.kodilla.homework;

public class Bank {

    private CashMachine[] cashMachines;

    public Bank(CashMachine... cashMachines) {
        this.cashMachines = cashMachines;
    }

    public double getTotalAmountOfCashInAllCashMachines() {
        double totalAmount = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalAmount = totalAmount + cashMachine.getAmount();
        }
        return totalAmount;
    }

    public double getTotalAmountOfWithdrawals() {
        double totalAmountOfWithdrawals = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (double transaction : cashMachine.getTransactions()) {
                if (transaction < 0) {
                    totalAmountOfWithdrawals = totalAmountOfWithdrawals + transaction;
                }
            }
        }
        return totalAmountOfWithdrawals*-1;
    }

    public double getTotalAmountOfDeposits() {
        double totalAmountOfDeposits = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (double transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    totalAmountOfDeposits = totalAmountOfDeposits + transaction;
                }
            }
        }
        return totalAmountOfDeposits;
    }

    public double getAverageValueOfWithdrawals() {
        double totalAmountOfWithdrawals = 0;
        int quantityOfWithdrawals = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (double transaction : cashMachine.getTransactions()) {
                if (transaction < 0) {
                    quantityOfWithdrawals++;
                    totalAmountOfWithdrawals = totalAmountOfWithdrawals + transaction;
                }
            }
        }
        return (totalAmountOfWithdrawals*-1)/quantityOfWithdrawals;
    }

    public double getAverageValueOfDeposits() {
        double totalAmountOfDepostits = 0;
        int quantityOfDeposits = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (double transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    quantityOfDeposits++;
                    totalAmountOfDepostits = totalAmountOfDepostits + transaction;
                }
            }
        }
        return totalAmountOfDepostits/quantityOfDeposits;
    }
}
