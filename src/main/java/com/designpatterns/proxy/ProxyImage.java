package com.designpatterns.proxy;

/**
 * Created by mesut on 04.08.2016.
 */
public class ProxyImage implements Image {

    private RealImage realImage = null;
    private String fileName = null;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void displayImage() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.displayImage();
    }

    public void loadImage() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.loadImage();
    }
}
