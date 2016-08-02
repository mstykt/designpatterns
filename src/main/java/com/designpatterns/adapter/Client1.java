package com.designpatterns.adapter;

/**
 * Created by mesut on 02.08.2016.
 */
public class Client1 {

    public static void main(String[] args) {
        Source1 source1 = new Source1Impl();
        source1.mtd1();

        source1 = new SourceAdapter();
        source1.mtd1();
    }
}
