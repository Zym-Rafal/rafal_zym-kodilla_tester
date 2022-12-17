package com.kodilla.homework;

public class CashMachine {

    private double[] transactions;

    public CashMachine(double... transactions) {
        this.transactions = transactions;
    }

    public int getQuantityOfTransactions() {
        return transactions.length;
    }

    public double getBalance() {
        double balance = 0;
        for (double transaction : transactions) {
            balance += transaction;
        }
        return balance;
    }

    public double[] getTransactions() {
        return transactions;
    }

    public int getNumberOfDeposits() {
        int numberOfDeposits = 0;
        for (double transaction : transactions) {
            if (transaction > 0) {
                numberOfDeposits++;
            }
        }
        return numberOfDeposits;
    }

    public double getSumOfDeposits() {
        double sum = 0;
        for (double transaction : transactions) {
            if (transaction > 0) {
                sum = sum + transaction;
            }
        }
        return sum;
    }

    public int getNumberOfWithdraws() {
        int numberOfWithdraws = 0;
        for (double transaction : transactions) {
            if (transaction < 0) {
                numberOfWithdraws++;
            }
        }
        return numberOfWithdraws;
    }

    public double getSumOfWithdraws() {
        double sum = 0;
        for (double transaction : transactions) {
            if (transaction < 0) {
                sum = sum + transaction;
            }
        }
        return sum*-1;
    }
}
