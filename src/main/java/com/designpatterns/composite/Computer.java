package com.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mesut on 04.08.2016.
 */
public class Computer implements Item {

    List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public int itemId() {
        return 5;
    }

    public void itemName() {
        System.out.println("Computer");
    }

    public int itemPrise() {
        int prise = 0;

        for (Item item : items) {
            prise += item.itemPrise();
        }

        return prise;
    }
}
