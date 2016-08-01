package com.designpatterns.factory;

/**
 * Created by mesut on 01.08.2016.
 */
public class Mercedes implements Car {

    public void start() {
        System.out.println("mercedes started");
    }

    public void stop() {
        System.out.println("mercedes stopped");
    }

    public void mercedesMtd() {
        System.out.println("mercedesMtd invoked");
    }
}
