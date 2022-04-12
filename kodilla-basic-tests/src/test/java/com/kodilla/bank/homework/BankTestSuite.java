package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    Bank bank = new Bank();
    CashMachine cashmachineA = new CashMachine();
    CashMachine cashmachineB = new CashMachine();
    CashMachine cashmachineC = new CashMachine();

    @Test
        public void shouldCountBalance() {
        cashmachineA.add(1000);
        cashmachineB.add(2000);
        cashmachineC.add(2000);
        cashmachineA.add(-1000);

        bank.add(cashmachineA);
        bank.add(cashmachineB);
        bank.add(cashmachineC);

        assertEquals(4000,bank.balance());

    }
    @Test
    public void shouldCountNumberOfTransactions() {
        cashmachineA.add(1000);
        cashmachineB.add(2000);
        cashmachineC.add(2000);
        cashmachineA.add(-1000);
        cashmachineB.add(-500);
        cashmachineC.add(-1000);

        bank.add(cashmachineA);
        bank.add(cashmachineB);
        bank.add(cashmachineC);

        assertEquals(6,bank.numberOfTransactions());
    }
    @Test
    public void shouldCountNumberOfDeposit() {
        cashmachineA.add(1000);
        cashmachineB.add(2000);
        cashmachineC.add(2000);
        cashmachineA.add(-1000);
        cashmachineB.add(-500);
        cashmachineC.add(-1000);

        bank.add(cashmachineA);
        bank.add(cashmachineB);
        bank.add(cashmachineC);

        assertEquals(3,bank.deposit());
    }
    @Test
    public void shouldCountNumberOfDebet() {
        cashmachineA.add(1000);
        cashmachineB.add(2000);
        cashmachineC.add(2000);
        cashmachineA.add(-1000);
        cashmachineB.add(-500);
        cashmachineC.add(-1000);

        bank.add(cashmachineA);
        bank.add(cashmachineB);
        bank.add(cashmachineC);

        assertEquals(3,bank.debet());
    }
    @Test
    public void shouldCountAmountDeposit() {
        cashmachineA.add(1000);
        cashmachineB.add(2000);
        cashmachineC.add(2000);
        cashmachineA.add(-1000);
        cashmachineB.add(-500);
        cashmachineC.add(-1000);

        bank.add(cashmachineA);
        bank.add(cashmachineB);
        bank.add(cashmachineC);

        assertEquals(5000,bank.amountDeposit());
    }
    @Test
    public void shouldCountAmountDebet() {
        cashmachineA.add(1000);
        cashmachineB.add(2000);
        cashmachineC.add(2000);
        cashmachineA.add(-1000);
        cashmachineB.add(-500);
        cashmachineC.add(-1000);

        bank.add(cashmachineA);
        bank.add(cashmachineB);
        bank.add(cashmachineC);

        assertEquals(-2500,bank.amountDebet());
    }
    @Test
    public void shouldCountAverageDeposit() {
        cashmachineA.add(1000);
        cashmachineB.add(2000);
        cashmachineC.add(3000);
        cashmachineA.add(-1000);
        cashmachineB.add(-500);
        cashmachineC.add(-1000);

        bank.add(cashmachineA);
        bank.add(cashmachineB);
        bank.add(cashmachineC);

        assertEquals(2000,bank.averageDeposit());
    }
    @Test
    public void shouldCountAverageDebet() {
        cashmachineA.add(1000);
        cashmachineB.add(2000);
        cashmachineC.add(3000);
        cashmachineA.add(-1500);
        cashmachineB.add(-500);
        cashmachineC.add(-1000);

        bank.add(cashmachineA);
        bank.add(cashmachineB);
        bank.add(cashmachineC);

        assertEquals(-1000,bank.averageDebet());
    }
}
