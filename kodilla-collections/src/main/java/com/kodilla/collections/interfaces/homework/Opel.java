package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private double speed;

    public Opel(int speed) {

        this.speed = speed;
    }

    public double getSpeed() {

        return speed;
    }
    public void increaseSpeed() {
        speed = speed * 1.25;
    }
    public void decreaseSpeed() {speed = speed * 0.85;
    }
}
