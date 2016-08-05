package com.designpatterns.observer;

/**
 * Created by mesut on 05.08.2016.
 */
public class SubscriberImpl implements Subscriber {

    private Magazine magazine;
    private String name;
    private String surname;

    public SubscriberImpl(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void update() {
        System.out.println(name + " " + surname + " receive the magazine");
    }

    public void cancelSubscription() {
        magazine.deleteSubscriber(this);
        System.out.println(name + " " + surname + "  has canceled the subscription");
    }

    public void beSubscriber(Magazine magazine) {
        setMagazine(magazine);
        this.magazine.addSubscriber(this);
        System.out.println(name + " " + surname + " is subscriber");
    }
}
