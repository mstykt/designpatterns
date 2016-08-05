package com.designpatterns.iterator;

/**
 * Created by mesut on 05.08.2016.
 */
public class AppMain {

    public static void main(String[] args) {
        AppContainer contanier = new AppContanierImpl();
        AppIterator iterator = contanier.createIterator();
        while (iterator.hasNext()) {
            System.out.println("Name: " + iterator.next());
        }
    }
}
