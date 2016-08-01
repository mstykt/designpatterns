package com.designpatterns.builder;

/**
 * Created by mesut on 01.08.2016.
 */
public class Brand {

    private String brandName;

    public Brand(String brandName) {
        setBrandName(brandName);
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
