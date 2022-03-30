package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    int a;
    int b;
    int c;
    int h;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    @Override
    public void givePerimeter() {
        System.out.println("Obwod trojkata wynosi:   "+ (a+b+c) );
    }

    @Override
    public void giveField() {
        System.out.println("Pole trojkata wynosi:   "+ (a*h/2));
    }

}
