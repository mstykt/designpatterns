package com.designpatterns.builder;

/**
 * Created by mesut on 01.08.2016.
 */
public class AppBuilder {

    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        manager.createOrder("Mercedes", "AMG", "White", 120);
        manager.printOrder();

        manager.createOrder("Audi", "A4", "Black", 140);
        manager.printOrder();
    }
}
