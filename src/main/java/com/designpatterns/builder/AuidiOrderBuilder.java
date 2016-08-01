package com.designpatterns.builder;

/**
 * Created by mesut on 01.08.2016.
 */
public class AuidiOrderBuilder extends OrderBuilder {

    public AuidiOrderBuilder() {
        System.out.println("audi created");
    }

    public void setBrand(String brandName) {
        super.getCar().setBrand(new Brand(brandName));
    }

    public void setModel(String modelName) {
        super.getCar().setModel(new Model(modelName));
    }

    public void setColor(String color) {
        super.getCar().setColor(color);
    }

    public void setPower(int power) {
        super.getCar().setPower(power);
    }
}
