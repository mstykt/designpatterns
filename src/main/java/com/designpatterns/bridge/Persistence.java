package com.designpatterns.bridge;

/**
 * Created by mesut on 02.08.2016.
 */
public interface Persistence {
    void persist();
    void findById();
    void delete();
}
