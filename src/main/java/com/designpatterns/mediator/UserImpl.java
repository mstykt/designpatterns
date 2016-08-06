package com.designpatterns.mediator;

/**
 * Created by mesut on 07.08.2016.
 */
public class UserImpl extends User {

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    public void send(String msg) {
        System.out.println(super.name + " Sending message: " + msg);
        mediator.sendMessage(msg, this);
    }

    public void receive(String msg) {
        System.out.println(super.name + " Received message: " + msg);
    }
}
