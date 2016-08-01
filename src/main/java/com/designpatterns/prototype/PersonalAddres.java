package com.designpatterns.prototype;

/**
 * Created by mesut on 01.08.2016.
 */
public class PersonalAddres extends AddressPrototype {

    private String name;
    private String surname;

    public PersonalAddres(String name, String surname, String city, String district, String street, String no) {
        this.name = name;
        this.surname = surname;
        setCity(city);
        setDistrict(district);
        setStreet(street);
        setNo(no);
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
}
