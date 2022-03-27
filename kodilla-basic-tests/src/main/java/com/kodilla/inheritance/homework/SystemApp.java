package com.kodilla.inheritance.homework;

public class SystemApp {
    public static void main(String[] args) {
    OperatingSystem operatingSystem = new OperatingSystem(2002);
    operatingSystem.turnOn();

    SysWin sysWin = new SysWin(2020);
    sysWin.printScreen();

    SysMac sysMac = new SysMac(2022);
    sysMac.turnMonitor();
    }
}
