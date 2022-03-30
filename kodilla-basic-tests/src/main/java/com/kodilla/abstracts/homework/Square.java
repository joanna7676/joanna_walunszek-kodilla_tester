package com.kodilla.abstracts.homework;

public class Square extends Shape {
    int a ;
    public Square(int a) {
        this.a = a;
    }

    @Override
    public void givePerimeter() {

        System.out.println("Obwod kwadratu wynosi:   "+ (4*a) );
    }

    @Override
    public void giveField() {
        System.out.println("Pole kwadratu wynosi:   "+ (a*a));
    }
}
