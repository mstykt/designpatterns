package com.designpatterns.composite;

/**
 * Created by mesut on 04.08.2016.
 */
public class AppComposite {

    public static void main(String[] args) {
        Item keyboard = new Keyboard();
        Item monitor = new Monitor();
        Item mouse = new Mouse();
        Item ram = new Ram();

        Computer computer = new Computer();
        computer.addItem(keyboard);
        computer.addItem(monitor);
        computer.addItem(mouse);
        computer.addItem(ram);

        System.out.println("Ram Info: ");
        ram.itemName();
        System.out.println("Ram Prise: " + ram.itemPrise());

        System.out.println("Computer Info:");
        computer.itemName();
        System.out.println("Computer Prise: " + computer.itemPrise());
    }
}
