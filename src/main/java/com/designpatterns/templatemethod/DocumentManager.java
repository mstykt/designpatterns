package com.designpatterns.templatemethod;

/**
 * Created by mesut on 07.08.2016.
 */
public abstract class DocumentManager {

    public final Document getDocument(String name) {
        Document document = openDocument(name);
        checkDocument(document);
        return document;
    }

    public abstract Document openDocument(String name);
    public abstract void checkDocument(Document document);
}
