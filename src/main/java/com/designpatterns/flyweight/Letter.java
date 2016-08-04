package com.designpatterns.flyweight;

/**
 * Created by mesut on 04.08.2016.
 */
public class Letter {
    private String letter;

    public Letter(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}
