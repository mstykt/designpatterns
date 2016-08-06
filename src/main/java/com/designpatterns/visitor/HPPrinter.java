package com.designpatterns.visitor;

/**
 * Created by mesut on 07.08.2016.
 */
public class HPPrinter implements Printer {

    public void print() {
        System.out.println(toString() + " Printing..");
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "HP Printer";
    }
}
