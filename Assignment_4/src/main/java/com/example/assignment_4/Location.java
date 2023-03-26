package com.example.assignment_4;

public class Location {
    public Location(String country, String address, String city) {
        this.country = country;
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

    private String country;

    private String address;

    private String city;
}
