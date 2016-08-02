package com.designpatterns.adapter;

/**
 * Created by mesut on 02.08.2016.
 */
public class SourceAdapter extends Source2Impl implements Source1 {

    /*
        In this approach Client 1 needs mtd2 for this reason
        we created this adapter class which is extends Source2Impl and implements Source1
     */
    public void mtd1() {
        super.mtd2();
    }
}
