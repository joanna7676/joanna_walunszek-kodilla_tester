package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int size;

    public Bank() {
        this.size = 0;
        this.cashMachines = new CashMachine[0];
    }
    public void add(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }
    public int balance() {
        int result = 0;
        for (CashMachine machine : this.cashMachines) {
            result += machine.getBalance();
        }
        return result;
    }
    public int numberOfTransactions() {
        int number = 0;
        for (CashMachine machine : this.cashMachines) {
            number += machine.getNumberAll();
        }
        return number;
    }

    public int deposit() {
        int number = 0;
        for (CashMachine machine : this.cashMachines) {
            number += machine.getNumberDeposit();
        }
        return number;
    }
    public int debet() {
        int number = 0;
        for (CashMachine machine : this.cashMachines) {
            number += machine.getNumberDebet();
        }
        return number;
    }
    public int amountDebet() {
        int number = 0;
        for (CashMachine machine : this.cashMachines
        ) {
            number += machine.getAmountDebet();
        }
        return number;
    }
    public int amountDeposit() {
        int number = 0;
        for (CashMachine machine : this.cashMachines
        ) {
            number += machine.getAmountDeposit();
        }
        return number;
    }
    public int averageDebet() {
        return amountDebet() / debet();
    }
    public int averageDeposit() {
        return amountDeposit() / deposit();
    }
    }



