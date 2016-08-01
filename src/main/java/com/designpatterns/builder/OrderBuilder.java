package com.designpatterns.builder;

/**
 * Created by mesut on 01.08.2016.
 */
public abstract class OrderBuilder {

    private Car car = new Car();

    public OrderBuilder() {
    }

    public Car getCar() {
        if (car == null) {
            return new Car();
        }
        return car;
    }

    public abstract void setBrand(String brandName);
    public abstract void setModel(String modelName);
    public abstract void setColor(String color);
    public abstract void setPower(int power);
}
