package com.designpatterns.bridge;

/**
 * Created by mesut on 02.08.2016.
 */
public class CarDAOImpl implements ExampleDAO {

    public void saveObject() {
        System.out.println("CarDAOImpl saveObject invoked");
    }

    public void getObjectById() {
        System.out.println("CarDAOImpl getObjectById invoked");
    }

    public void deleteObject() {
        System.out.println("CarDAOImpl deleteObject invoked");
    }
}
