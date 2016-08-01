package com.designpatterns.prototype;

/**
 * Created by mesut on 01.08.2016.
 */
public abstract class AddressPrototype implements Cloneable {

    private String city;
    private String district;
    private String street;
    private String no;

    public AddressPrototype() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void printAddress() {
        System.out.println("City: " + getCity());
        System.out.println("District: " + getDistrict());
        System.out.println("Street: " + getStreet());
        System.out.println("No: " + getNo());
        System.out.println("HashCode: " + hashCode());
    }
}
