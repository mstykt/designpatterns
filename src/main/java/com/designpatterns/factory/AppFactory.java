package com.designpatterns.factory;

/**
 * Created by mesut on 01.08.2016.
 */
public class AppFactory {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.createCar(CarType.F_TYPE);
        car.start();
        car.stop();
    }
}
