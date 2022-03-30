package com.kodilla.abstracts.homework;

public class JobApp {
    public static void main(String[] args) {
        Driver driver = new Driver(2000, "driving car");
        Person person = new Person("John", 32, driver);
        person.showResponsibilities();

        Doctor doctor = new Doctor(5000,"patient treatment");
        Person person1 = new Person("Mark", 40, doctor);
        person1.showResponsibilities();

        Baker baker = new Baker(3500,"baking bread");
        Person person2 = new Person("Clark",50, baker);
        person2.showResponsibilities();
    }
}
