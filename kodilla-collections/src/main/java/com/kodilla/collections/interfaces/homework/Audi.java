package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    private double speed;

    public Audi(int speed) {

        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }
    public void increaseSpeed() {
        speed = speed * 1.3;
    }
    public void decreaseSpeed() {
        speed = speed * 0.8;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "speed=" + speed +
                '}';
    }
}
