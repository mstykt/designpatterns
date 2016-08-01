package com.designpatterns.singleton;

/**
 * Created by mesut on 01.08.2016.
 */
public class Singleton {

    private static volatile Singleton singleton = new Singleton();
    private static Object lock = new Object();

    private Singleton() {
        System.out.println("Singleton init!");
    }

    public static Singleton instance() {
        if (singleton == null) {
            //Double check mechanism for singleton object
            synchronized (lock) {
                if (singleton == null) {
                    return new Singleton();
                }
            }
        }
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("This object can not clone!");
    }
}
