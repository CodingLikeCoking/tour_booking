package com.example.assignment_4;

public class Tours {
    // Instance variables
    // private int number;
    private String title;
    private String description;
    private int price;
    private String host;
    private String typeOfTour;
    private Location location;
    private Time date;
    private int availability; // numOfSlotsAvailable??
    private Review review;

    public Tours(String title, String description, int price, String host, String typeOfTour, Location location,
            Time date, int availability, Review review) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.host = host;
        this.typeOfTour = typeOfTour;
        this.location = location;
        this.date = date;
        this.availability = availability;
        this.review = review;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getTypeOfTour() {
        return typeOfTour;
    }

    public void setTypeOfTour(String typeOfTour) {
        this.typeOfTour = typeOfTour;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Time getDate() {
        return date;
    }

    public void setDate(Time date) {
        this.date = date;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}
