package com.designpatterns.proxy;

/**
 * Created by mesut on 04.08.2016.
 */
public class RealImage implements Image {

    private String fileName = null;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImage();
    }

    public void displayImage() {
        System.out.println("Image displayed: " + fileName);
    }

    public void loadImage() {
        System.out.println("Image loaded: " + fileName);
    }
}
