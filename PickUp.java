package com.example.throunapp;

public class PickUp {
    public PickUp(Time time, Location location, int noOfPeoplePickedUp) {
        this.time = time;
        this.location = location;
        this.noOfPeoplePickedUp = noOfPeoplePickedUp;
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

    public int getNoOfPeoplePickedUp() {
        return noOfPeoplePickedUp;
    }

    public void setNoOfPeoplePickedUp(int noOfPeoplePickedUp) {
        this.noOfPeoplePickedUp = noOfPeoplePickedUp;
    }

    private Time time;

    private Location location;

    private int noOfPeoplePickedUp;

}
