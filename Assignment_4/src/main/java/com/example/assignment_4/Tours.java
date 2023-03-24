package com.example.assignment_4;

public class Tours {

    public Tours(String title, String description, int price, String host, Location location, Time dateAndTime, int availability, Review review) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.host = host;
        this.location = location;
        this.dateAndTime = dateAndTime;
        this.availability = availability;
        this.review = review;
    }
    private String title;
    private String description;


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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Time getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Time dateAndTime) {
        this.dateAndTime = dateAndTime;
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

    private int price;

    private String host;

    private Location location;

    private Time dateAndTime;

    private int availability;

    private Review review;
}
