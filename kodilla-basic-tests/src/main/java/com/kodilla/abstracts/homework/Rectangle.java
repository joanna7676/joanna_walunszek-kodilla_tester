package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public void givePerimeter() {
        System.out.println("Obwod prostokata wynosi:   "+ (2*a+2*b) );
    }

    @Override
    public void giveField() {
        System.out.println("Pole prostokata wynosi:   "+ (a*b));
    }
}
