package com.designpatterns.abstractfactory;

/**
 * Created by mesut on 01.08.2016.
 */
public class FruitFactoryImpl2 implements FruitFactory {

    public Apple getApple() {
        return new GreenApple();
    }

    public Plum getPlum() {
        return new RedPlum();
    }
}
