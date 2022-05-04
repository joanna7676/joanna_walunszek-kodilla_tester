package com.kodilla.collections.adv.immutable.special.homework;


public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook ("Quo vadis", "Henryk Sienkiewicz");
        Book book2 = BookManager.createBook ("Zemsta", "Aleksander Fredro");
        Book book3 = BookManager.createBook ("Dziady", "Adam Mickiewicz");
        Book book4 = BookManager.createBook ("Dziady", "Adam Mickiewicz");

        System.out.println(book1 == book2);
        System.out.println(book2 == book3);
        System.out.println(book3 == book4);

    }
    }

