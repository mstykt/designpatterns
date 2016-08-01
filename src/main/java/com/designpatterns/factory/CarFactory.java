package com.designpatterns.factory;

/**
 * Created by mesut on 01.08.2016.
 */
public class CarFactory {

    public Car createCar(CarType carType) {
        if (carType.getIndex() == 1) {
            return new Mercedes();
        } else if (carType.getIndex() == 2) {
            return new Ford();
        }
        return null;
    }
}
