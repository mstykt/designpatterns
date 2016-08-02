package com.designpatterns.bridge;

/**
 * Created by mesut on 02.08.2016.
 */
public class PersistenceImp implements Persistence {

    private ExampleDAO exampleDAO;

    public PersistenceImp(ExampleDAO exampleDAO) {
        this.exampleDAO = exampleDAO;
    }

    public void persist() {
        exampleDAO.saveObject();
    }

    public void findById() {
        exampleDAO.getObjectById();
    }

    public void delete() {
        exampleDAO.deleteObject();
    }
}
