package com.designpatterns.composite;

/**
 * Created by mesut on 04.08.2016.
 */
public class Monitor implements Item {

    public int itemId() {
        return 1;
    }

    public void itemName() {
        System.out.println("Monitor");
    }

    public int itemPrise() {
        return 60;
    }
}
