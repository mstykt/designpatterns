package com.designpatterns.facade;

/**
 * Created by mesut on 03.08.2016.
 */
public class AppFacade {

    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();
    }
}
