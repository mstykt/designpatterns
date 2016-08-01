package com.designpatterns.builder2;

/**
 * Created by mesut on 01.08.2016.
 */
public class AppBuilder {

    public static void main(String[] args) {
        User user = new User.UserBuilder("name 1", "surname 1").build();
        System.out.println(user);

        user = new User.UserBuilder("name 2", "surname 2")
                .age(25)
                .phone("123456")
                .address("address 2")
                .build();
        System.out.println(user);

        user = new User.UserBuilder("name 3", "surname 3")
                .age(26)
                .address("address 3")
                .build();
        System.out.println(user);
    }
}
