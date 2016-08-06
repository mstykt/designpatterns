package com.designpatterns.strategy;

/**
 * Created by mesut on 06.08.2016.
 */
public class AppStratgy {

    public static void main(String[] args) {
        Contex contex = new Contex(new Addition());
        System.out.println("Addition: " + contex.executeOperation(5,3));

        contex = new Contex(new Division());
        System.out.println("Division: " + contex.executeOperation(7,0));
    }
}
