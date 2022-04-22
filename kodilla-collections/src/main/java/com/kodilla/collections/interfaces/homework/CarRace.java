package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Ford ford = new Ford(100);
        doRace(ford);

        Opel opel = new Opel(100);
        doRace(opel);

        Audi audi = new Audi(100);
        doRace(audi);
    }

    private static void doRace(Car car)
    {
        car.decreaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        System.out.println(car.getClass().getSimpleName() + " " + car.getSpeed());
    }
}
