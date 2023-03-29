package com.example.assignment_4;

public class DropOff {

    // Instance variables
    private Time time;
    private Location locations;

    public DropOff(Time time, Location locations) {
        this.time = time;
        this.locations = locations;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Location getLocations() {
        return locations;
    }

    public void setLocations(Location locations) {
        this.locations = locations;
    }
}
