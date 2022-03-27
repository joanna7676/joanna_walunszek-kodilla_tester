package com.kodilla.inheritance.homework;

public class SysWin extends OperatingSystem {

    public SysWin(int year) {
        super(year);
        System.out.println("Win constructor");
    }

    public void printScreen() {
        System.out.println("Printing screen...");
    }

    }

