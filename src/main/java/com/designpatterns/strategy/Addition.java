package com.designpatterns.strategy;

/**
 * Created by mesut on 06.08.2016.
 */
public class Addition implements Strategy {

    public int doOperation(int var1, int var2) {
        return var1 + var2;
    }
}
