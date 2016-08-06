package com.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mesut on 07.08.2016.
 */
public class ChatMediatorImpl implements ChatMediator {

    private List<User> users = new ArrayList<User>();

    public void sendMessage(String msg, User user) {
        for (User u : this.users) {
            if (u != user)
                u.receive(msg);
        }
    }

    public void addUser(User user) {
        this.users.add(user);
    }
}
