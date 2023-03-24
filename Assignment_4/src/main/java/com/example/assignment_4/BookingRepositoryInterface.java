package com.example.assignment_4;

public interface BookingRepositoryInterface {
    public Booking addBooking(int order, Tours tour, Time date, User users, int numOfPpl, PickUp pickUp, DropOff dropOff);
}
