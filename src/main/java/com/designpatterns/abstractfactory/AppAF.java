package com.designpatterns.abstractfactory;

/**
 * Created by mesut on 01.08.2016.
 */
public class AppAF {

    public static void main(String[] args) {
        FruitFactory factory = new FruitFactoryImpl();
        Apple apple = factory.getApple();
        Plum plum = factory.getPlum();

        apple.getType();
        plum.getType();

        factory = new FruitFactoryImpl2();
        apple = factory.getApple();
        plum = factory.getPlum();

        apple.getType();
        plum.getType();
    }
}
