package com.example.assignment_4;

public class Booking {
    public Booking(int order, Tours tour, User user, int numOfPeople, PickUp pickUp, DropOff dropOff) {
        this.order = order;
        this.tour = tour;
        this.user = user;
        this.numOfPeople = numOfPeople;
        this.pickUp = pickUp;
        this.dropOff = dropOff;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Tours getTour() {
        return tour;
    }

    public void setTour(Tours tour) {
        this.tour = tour;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public PickUp getPickUp() {
        return pickUp;
    }

    public void setPickUp(PickUp pickUp) {
        this.pickUp = pickUp;
    }

    public DropOff getDropOff() {
        return dropOff;
    }

    public void setDropOff(DropOff dropOff) {
        this.dropOff = dropOff;
    }

    private int order;
    private Tours tour;
    private User user;
    private int numOfPeople;
    private PickUp pickUp;
    private DropOff dropOff;
}

