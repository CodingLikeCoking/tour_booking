package com.example.assignment_4;

public class PickUp {

    // Instance variables
    private Time time;
    private Location location;
    private int numOfPeoplePickup;

    public PickUp(Time time, Location location, int numOfPeoplePickup) {
        this.time = time;
        this.location = location;
        this.numOfPeoplePickup = numOfPeoplePickup;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getNumOfPeoplePickup() {
        return numOfPeoplePickup;
    }

    public void setNumOfPeoplePickup(int numOfPeoplePickup) {
        this.numOfPeoplePickup = numOfPeoplePickup;
    }
}
