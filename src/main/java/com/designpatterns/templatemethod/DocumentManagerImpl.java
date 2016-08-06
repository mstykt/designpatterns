package com.designpatterns.templatemethod;

/**
 * Created by mesut on 07.08.2016.
 */
public class DocumentManagerImpl extends DocumentManager {

    public Document openDocument(String name) {
        System.out.println("Document " + name + " opened");
        return new Pdf();
    }

    public void checkDocument(Document document) {
        System.out.println(document.toString() + " checked.");
    }
}
