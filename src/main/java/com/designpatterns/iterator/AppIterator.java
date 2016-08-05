package com.designpatterns.iterator;

/**
 * Created by mesut on 05.08.2016.
 */
public interface AppIterator<T> {
    boolean hasNext();
    T next();
}
