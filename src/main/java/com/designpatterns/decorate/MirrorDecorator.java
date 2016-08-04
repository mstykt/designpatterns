package com.designpatterns.decorate;

/**
 * Created by mesut on 04.08.2016.
 */
public class MirrorDecorator implements HomeStuff {

    private HomeStuff mirror = new Mirror();

    public HomeStuff getMirror() {
        return mirror;
    }

    public void setMirror(HomeStuff mirror) {
        this.mirror = mirror;
    }

    public void produce() {
        mirror.produce();
    }
}
