package com.designpatterns.proxy;

/**
 * Created by mesut on 04.08.2016.
 */
public class AppImage {

    public static void main(String[] args) {
        Image image = new ProxyImage("fileName");
        image.displayImage();
        image.loadImage();
    }
}
