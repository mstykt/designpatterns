package com.designpatterns.observer;

/**
 * Created by mesut on 05.08.2016.
 */
public interface Magazine {
    void addSubscriber(Subscriber subscriber);
    void deleteSubscriber(Subscriber subscriber);
    void sendMagazine();
}
