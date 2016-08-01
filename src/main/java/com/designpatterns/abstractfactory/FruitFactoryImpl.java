package com.designpatterns.abstractfactory;

/**
 * Created by mesut on 01.08.2016.
 */
public class FruitFactoryImpl implements FruitFactory {

    public Apple getApple() {
        return new RedApple();
    }

    public Plum getPlum() {
        return new GreenPlum();
    }
}
