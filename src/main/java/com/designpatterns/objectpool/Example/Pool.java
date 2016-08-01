package com.designpatterns.objectpool.Example;

/**
 * Created by mesut on 01.08.2016.
 */
public class Pool {
    private static int counter = 0;

    public Pool() {
        if (counter == 4) {
            throw new RuntimeException("Can not create 5. object");
        }
        System.out.println("pool object created " + (counter + 1)+". object" );
        counter++;
    }
}
