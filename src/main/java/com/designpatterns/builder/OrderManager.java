package com.designpatterns.builder;

/**
 * Created by mesut on 01.08.2016.
 */
public class OrderManager {

    private OrderBuilder builder;

    public Car createOrder(String brandName, String modelName, String color, int power) {
        if (brandName.equals("Mercedes")) {
            builder = new MercedesOrderBuilder();
        } else if (brandName.equals("Audi")) {
            builder = new AuidiOrderBuilder();
        }

        builder.setBrand(brandName);
        builder.setModel(modelName);
        builder.setColor(color);
        builder.setPower(power);
        return builder.getCar();
    }

    public void printOrder(){
        System.out.println("Brande: " + builder.getCar().getBrand());
        System.out.println("Model: " + builder.getCar().getModel());
        System.out.println("Color: " + builder.getCar().getColor());
        System.out.println("Power: " + builder.getCar().getPower());
    }
}
