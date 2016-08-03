package com.designpatterns.facade;

/**
 * Created by mesut on 03.08.2016.
 */
public class ShapeFacade {

    private Shape shape;

    public void drawCircle() {
        shape = new Circle();
        shape.draw();
    }

    public  void drawRectangle() {
        shape = new Rectangle();
        shape.draw();
    }

    public void drawSquare() {
        shape = new Square();
        shape.draw();
    }
}
