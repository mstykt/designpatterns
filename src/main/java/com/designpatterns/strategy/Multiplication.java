package com.designpatterns.strategy;

/**
 * Created by mesut on 06.08.2016.
 */
public class Multiplication implements Strategy {

    public int doOperation(int var1, int var2) {
        return var1 * var2;
    }
}
