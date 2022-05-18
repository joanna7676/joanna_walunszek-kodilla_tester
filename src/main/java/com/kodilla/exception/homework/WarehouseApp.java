package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
    Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("1000"));
        warehouse.addOrder(new Order("1001"));
        warehouse.addOrder(new Order("1003"));
        warehouse.addOrder(new Order("1005"));
        warehouse.addOrder(new Order("1007"));

        try {
            warehouse.getOrder("100");
        } catch (OrderDoesntExistException e) {
            System.out.println("Zamówienie nie istnieje ");
        }

    }
}
