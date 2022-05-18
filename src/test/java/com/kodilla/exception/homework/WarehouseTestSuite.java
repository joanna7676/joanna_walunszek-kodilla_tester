package com.kodilla.exception.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void shouldGetOrder() throws OrderDoesntExistException {
       Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1000"));
        warehouse.addOrder(new Order("1001"));
        warehouse.addOrder(new Order("1003"));
        Order result = warehouse.getOrder("1000");

        Assertions.assertEquals("1000", result.getNumber());
            }
    @Test
    public void shouldThrowException() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1000"));
        warehouse.addOrder(new Order("1001"));
        warehouse.addOrder(new Order("1003"));
        Assertions.assertThrows(OrderDoesntExistException.class, ()-> warehouse.getOrder("100"));



    }
}