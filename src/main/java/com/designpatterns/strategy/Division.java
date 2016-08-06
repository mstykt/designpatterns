package com.designpatterns.strategy;

/**
 * Created by mesut on 06.08.2016.
 */
public class Division implements Strategy {

    public int doOperation(int var1, int var2) {
        if (var2  == 0)
            var2 = 1;

        return var1 / var2;
    }
}
