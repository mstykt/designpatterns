package com.designpatterns.factory;

/**
 * Created by mesut on 01.08.2016.
 */
public enum CarType {
    M_TYPE(1,"Mercedes"), F_TYPE(2,"FORD");

    private final int index;
    private final String name;

    private CarType(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }
}
