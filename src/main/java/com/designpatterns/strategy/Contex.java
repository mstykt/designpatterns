package com.designpatterns.strategy;

/**
 * Created by mesut on 06.08.2016.
 */
public class Contex {

    private Strategy strategy;

    public Contex(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeOperation(int var1, int var2) {
        return strategy.doOperation(var1, var2);
    }
}
