package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mesut on 05.08.2016.
 */
public class MagazineImpl implements Magazine {

    List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void deleteSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void sendMagazine() {
        for (int i = 0; i < subscribers.size(); i++) {
            subscribers.get(i).update();
        }
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }
}
