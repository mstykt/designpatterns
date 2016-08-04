package com.designpatterns.composite;

/**
 * Created by mesut on 04.08.2016.
 */
public class Mouse implements Item {

    public int itemId() {
        return 4;
    }

    public void itemName() {
        System.out.println("Mouse");
    }

    public int itemPrise() {
        return 20;
    }
}
