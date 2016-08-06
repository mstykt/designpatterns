package com.designpatterns.mediator;

/**
 * Created by mesut on 07.08.2016.
 */
public class AppMediator {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user = new UserImpl(mediator, "Lisa");
        User user1 = new UserImpl(mediator, "David");
        User user2 = new UserImpl(mediator, "Jack");
        User user3 = new UserImpl(mediator, "Jane");
        mediator.addUser(user);
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        user.send("Hi All");
    }
}
