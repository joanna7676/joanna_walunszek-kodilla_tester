package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
    } else
    {
        System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
    }
        Calculator calculator1 = new Calculator();
        int c = 15;
        int d = 8;
        int subtractResult = calculator1.subtract(c, d);
        boolean correct1 = ResultChecker.assertEquals(7, subtractResult);

        if (correct1) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + c + " i " + d);
        }
        else
        {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + c + " i " + d);
        }
        Calculator calculator2 = new Calculator();
        int e = 5;

        int multiplicationResult = calculator2.multiplication(e);
        boolean correct2 = ResultChecker.assertEquals(25, multiplicationResult);

        if (correct2) {
            System.out.println("Metoda multiplication działa poprawnie dla liczby " + e);
        }
        else
        {
            System.out.println("Metoda multiplication nie działa poprawnie dla liczby " + e);
        }
    }
}
