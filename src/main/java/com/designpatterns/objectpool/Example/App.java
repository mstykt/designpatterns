package com.designpatterns.objectpool.Example;

/**
 * Created by mesut on 01.08.2016.
 */
public class App {

    public static void main(String[] args) {
        Pool pool = new Pool();
        Pool pool1 = new Pool();
        Pool pool2 = new Pool();
        Pool pool3 = new Pool();

        //This statement will give an exception
        //Pool pool4 = new Pool();
    }
}
