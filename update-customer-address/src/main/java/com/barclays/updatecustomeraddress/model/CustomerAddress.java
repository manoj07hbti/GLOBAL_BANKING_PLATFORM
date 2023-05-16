package com.barclays.updatecustomeraddress.model;

import com.sun.istack.internal.NotNull;

public class CustomerAddress {

    @NotNull
    String type;
    String cityName;
    String stateName;
    @NotNull
    int areaCode;
    String addressLine1;
    String addressLine2;

    public CustomerAddress() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String getAddressLine2) {
        this.addressLine2 = addressLine2;
    }
}
