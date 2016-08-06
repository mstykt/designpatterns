package com.designpatterns.visitor;

/**
 * Created by mesut on 07.08.2016.
 */
public class AppVisitor {

    public static void main(String[] args) {
        Printer hpPrinter = new HPPrinter();
        Printer lexmarkPrinter = new LexMarkPrinter();

        hpPrinter.print();
        lexmarkPrinter.print();

        Visitor visitor = new FaxVisitor();
        visitor.visit(hpPrinter);
        visitor.visit(lexmarkPrinter);
    }
}
