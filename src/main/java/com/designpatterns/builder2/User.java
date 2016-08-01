package com.designpatterns.builder2;

/**
 * Created by mesut on 01.08.2016.
 */
public class User {

    private String name;
    private String surname;
    private int age;
    private String phone;
    private String address;

    public User() {
    }

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class UserBuilder{
        private String name;
        private String surname;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
