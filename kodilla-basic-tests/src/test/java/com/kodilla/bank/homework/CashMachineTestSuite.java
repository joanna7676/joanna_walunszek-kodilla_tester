package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashmachine = new CashMachine();
        int[] transactions = cashmachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(100);
        cashmachine.add(200);

        int[] transactions = cashmachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(100, transactions[0]);
        assertEquals(200, transactions[1]);
    }

    @Test
    public void shouldCalculateBalance() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(100);
        cashmachine.add(-200);
        cashmachine.add(300);

        assertEquals(200, cashmachine.getBalance());
    }
    @Test
    public void shouldCalculateNumberOfDebets() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(100);
        cashmachine.add(-200);
        cashmachine.add(-300);
        cashmachine.add(-100);

        assertEquals(3, cashmachine.getNumberDebet());
    }
    @Test
    public void shouldCalculateNumberOfDeposits() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(100);
        cashmachine.add(200);
        cashmachine.add(300);
        cashmachine.add(100);

        assertEquals(4, cashmachine.getNumberDeposit());
    }
    @Test
    public void shouldCalculateAmountOfDebets() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(100);
        cashmachine.add(200);
        cashmachine.add(-300);
        cashmachine.add(-100);

        assertEquals(-400, cashmachine.getAmountDebet());
    }
    @Test
    public void shouldCalculateAmountOfDeposits() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(100);
        cashmachine.add(200);
        cashmachine.add(-300);
        cashmachine.add(-100);

        assertEquals(300, cashmachine.getAmountDeposit());
    }
}
