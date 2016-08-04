package com.designpatterns.decorate;

/**
 * Created by mesut on 04.08.2016.
 */
public class AppDecorator {

    public static void main(String[] args) {
        HomeStuff mirror = new FramedMirror();
        mirror.produce();
    }
}
