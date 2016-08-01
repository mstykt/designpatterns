package com.designpatterns.prototype;

/**
 * Created by mesut on 01.08.2016.
 */
public class AppPro {

    public static void main(String[] args) throws CloneNotSupportedException{
        PersonalAddres addres = new PersonalAddres("name", "surname", "city1", "district1", "street1", "no1");
        addres.printAddress();

         PersonalAddres personalAddres = (PersonalAddres) addres.clone();
        personalAddres.setStreet("sreet2");
        personalAddres.setNo("2");
        personalAddres.printAddress();
    }
}
