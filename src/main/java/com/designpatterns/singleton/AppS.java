package com.designpatterns.singleton;

/**
 * Created by mesut on 01.08.2016.
 */
public class AppS {

    public static void main(String[] args) {
        Singleton singleton = Singleton.instance();
        Singleton singleton1 = Singleton.instance();
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());

    }
}
