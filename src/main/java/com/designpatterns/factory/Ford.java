package com.designpatterns.factory;

/**
 * Created by mesut on 01.08.2016.
 */
public class Ford implements Car {

    public void start() {
        System.out.println("ford started");
    }

    public void stop() {
        System.out.println("ford stopped");
    }

    public void fordMtd() {
        System.out.println("fordMtd invoked");
    }
}
