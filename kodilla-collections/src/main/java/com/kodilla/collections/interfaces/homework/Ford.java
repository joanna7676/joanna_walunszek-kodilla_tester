package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private double speed;

    public Ford(int speed) {

        this.speed = speed;
    }

    public double getSpeed() {

        return speed;
    }
    public void increaseSpeed() {
         speed = speed * 1.2;
    }
    public void decreaseSpeed() {
        speed = speed * 0.9;
    }
}
