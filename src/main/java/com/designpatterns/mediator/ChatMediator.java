package com.designpatterns.mediator;

/**
 * Created by mesut on 07.08.2016.
 */
public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
