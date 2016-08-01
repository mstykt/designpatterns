package com.designpatterns.prototype;

/**
 * Created by mesut on 01.08.2016.
 */
public class JobAddress extends AddressPrototype {

    private String companyName;

    public JobAddress(String companyName, String city, String district, String street, String no) {
        this.companyName = companyName;
        setCity(city);
        setDistrict(district);
        setStreet(street);
        setNo(no);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
