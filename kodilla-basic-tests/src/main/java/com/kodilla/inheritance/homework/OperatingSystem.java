package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
        System.out.println("OS constructor");
    }
        public void turnOn() {
        System.out.println("System is turned on");
    }
        public void turnOff() {
        System.out.println("System is turned off");
    }
        public void turnMonitor() {
        System.out.println("Turning on monitor");
    }
        public int getYear() {
                return year;
    }
}
