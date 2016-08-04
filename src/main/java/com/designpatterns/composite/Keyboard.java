package com.designpatterns.composite;

/**
 * Created by mesut on 04.08.2016.
 */
public class Keyboard implements Item {

    public int itemId() {
        return 3;
    }

    public void itemName() {
        System.out.println("Keyboard");
    }

    public int itemPrise() {
        return 30;
    }
}
