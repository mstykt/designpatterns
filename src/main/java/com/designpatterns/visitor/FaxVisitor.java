package com.designpatterns.visitor;

/**
 * Created by mesut on 07.08.2016.
 */
public class FaxVisitor implements Visitor {

    public void visit(Printer printer) {
        if (printer instanceof HPPrinter)
            System.out.println(printer.toString() + " is Faxing...");
        else if (printer instanceof LexMarkPrinter)
            System.out.println(printer.toString() + " can not faxing!");
    }
}
