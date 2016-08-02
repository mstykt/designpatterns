package com.designpatterns.bridge;

/**
 * Created by mesut on 02.08.2016.
 */
public class PersonDAOImpl implements ExampleDAO {

    public void saveObject() {
        System.out.println("PersonDAOImpl saveObject invoked");
    }

    public void getObjectById() {
        System.out.println("PersonDAOImpl getObjectById invoked");
    }

    public void deleteObject() {
        System.out.println("PersonDAOImpl deleteObject invoked");
    }
}
