package com.designpatterns.visitor;

/**
 * Created by mesut on 07.08.2016.
 */
public interface Printer {
    void print();
    void accept(Visitor visitor);
}
