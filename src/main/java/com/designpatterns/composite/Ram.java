package com.designpatterns.composite;

/**
 * Created by mesut on 04.08.2016.
 */
public class Ram implements Item {

    public int itemId() {
        return 2;
    }

    public void itemName() {
        System.out.println("Ram");
    }

    public int itemPrise() {
        return 40;
    }
}
