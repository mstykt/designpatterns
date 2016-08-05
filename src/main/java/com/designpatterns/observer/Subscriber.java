package com.designpatterns.observer;

/**
 * Created by mesut on 05.08.2016.
 */
public interface Subscriber {
    void update();
    void cancelSubscription();
    void beSubscriber(Magazine magazine);
}
