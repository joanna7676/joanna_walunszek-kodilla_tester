package com.kodilla.inheritance.homework;

public class SysMac extends OperatingSystem{

    public SysMac(int year) {
        super(year);
        System.out.println("Mac constructor");
    }
    public void turnMonitor() {
        System.out.println("Turning on second monitor");
    }

}
