package com.designpatterns.flyweight;

/**
 * Created by mesut on 04.08.2016.
 */
public class AppFlyweight {

    public static void main(String[] args) {
        String firstRow = "This is first row";
        String secondRow = "This is second row";

        LetterManager.getManager().addRow(firstRow, 1);
        LetterManager.getManager().addRow(secondRow, 2);
        LetterManager.getDocument();
    }
}
