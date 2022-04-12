package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void add(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getBalance() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];}
                return sum;
    }

    public int getNumberAll() {
        return transactions.length;
    }

    public int getNumberDebet() {
        int d = 0;
        for (int i = 0; i < this.transactions.length; i++)
            if (transactions[i] < 0) d=d+1;
        return d;
            }

    public int getNumberDeposit() {
        int d = 0;
        for (int i = 0; i < this.transactions.length; i++)
            if (transactions[i] > 0) d=d+1;
        return d;
    }
    public int getAmountDebet() {
        int d = 0;
        for (int i = 0; i < this.transactions.length; i++)
            if (transactions[i] < 0) d=d+ transactions[i];
        return d;
    }
    public int getAmountDeposit() {
        int d = 0;
        for (int i = 0; i < this.transactions.length; i++)
            if (transactions[i] > 0) d=d+ transactions[i];
        return d;
    }
}
