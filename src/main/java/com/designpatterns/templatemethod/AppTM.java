package com.designpatterns.templatemethod;

/**
 * Created by mesut on 07.08.2016.
 */
public class AppTM {

    public static void main(String[] args) {
        DocumentManager manager = new DocumentManagerImpl();
        Document document = manager.openDocument("test_document");
        //document.toString();
    }
}
