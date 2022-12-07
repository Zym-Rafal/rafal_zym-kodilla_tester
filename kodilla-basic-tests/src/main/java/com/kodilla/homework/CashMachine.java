package com.kodilla.homework;

public class CashMachine {

    private double[] transactions;
    private double amount;

    public CashMachine(double amount, double... transactions) {
        this.transactions = transactions;
        this.amount = amount;
        for (double transaction : transactions) {
            this.amount = this.amount + transaction;
        }
    }

    public int getQuantityOfTransactions() {
        return transactions.length;
    }

    public double getAmount() {
        return amount;
    }

    public double[] getTransactions() {
        return transactions;
    }
}
