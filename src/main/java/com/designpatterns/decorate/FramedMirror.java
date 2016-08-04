package com.designpatterns.decorate;

/**
 * Created by mesut on 04.08.2016.
 */
public class FramedMirror extends MirrorDecorator {

    @Override
    public void produce() {
        super.getMirror().produce();
        addFrame();
    }

    public void addFrame() {
        System.out.println("Frame has been added.");
    }
}
