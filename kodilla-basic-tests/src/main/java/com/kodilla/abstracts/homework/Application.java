package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square(3) ;
        square.giveField();
        square.givePerimeter();

        Shape rectangle = new Rectangle(4, 5);
        rectangle.giveField();
        rectangle.givePerimeter();

        Shape triangle = new Triangle(4,5,6,5);
        triangle.giveField();
        triangle.givePerimeter();
    }
}