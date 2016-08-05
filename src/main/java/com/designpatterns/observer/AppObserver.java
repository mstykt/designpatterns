package com.designpatterns.observer;

/**
 * Created by mesut on 05.08.2016.
 */
public class AppObserver {

    public static void main(String[] args) {
        Magazine magazine = new MagazineImpl();
        Subscriber subscriber = new SubscriberImpl("David", "Beckham");
        subscriber.beSubscriber(magazine);

        Subscriber subscriber1 = new SubscriberImpl("Luis", "Figo");
        subscriber1.beSubscriber(magazine);

        magazine.sendMagazine();
    }
}
