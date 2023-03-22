package com.example.throunapp;

import org.controlsfx.control.WorldMapView;

public class Location {
    public Location(String country, String address, String city) {
        Country = country;
        this.address = address;
        this.city = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String Country;

    private String address;

    private String city;
}
