package com.designpatterns.bridge;

/**
 * Created by mesut on 02.08.2016.
 */
public class AppBridge {

    public static void main(String[] args) {
        Persistence persistence = new PersistenceImp(new PersonDAOImpl());
        persistence.persist();
        persistence.findById();
        persistence.delete();

        persistence = new PersistenceImp(new CarDAOImpl());
        persistence.persist();
        persistence.findById();
        persistence.delete();
    }
}
