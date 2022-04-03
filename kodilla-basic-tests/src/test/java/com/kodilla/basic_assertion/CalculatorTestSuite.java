package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator1 = new Calculator();
        int c = 15;
        int d = 8;
        int subtractResult = calculator1.subtract(c, d);
        assertEquals(7, subtractResult);
    }
    @Test
    public void testMultiplicationPositive() {
        Calculator calculator2 = new Calculator();
        int e = 1;

        int multiplicationResult = calculator2.multiplication(e);
        assertEquals(1, multiplicationResult);
    }
    @Test
    public void testMultiplicationZero() {
        Calculator calculator2 = new Calculator();
        int e = 0;

        int multiplicationResult = calculator2.multiplication(e);
        assertEquals(0, multiplicationResult);
    }
    @Test
    public void testMultiplicationNegative() {
        Calculator calculator2 = new Calculator();
        int e = -2;

        int multiplicationResult = calculator2.multiplication(e);
        assertEquals(4, multiplicationResult);
    }
    }
