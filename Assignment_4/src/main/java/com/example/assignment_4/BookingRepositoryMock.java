package com.example.assignment_4;

// simulates fix at given location
public class BookingRepositoryMock implements BookingRepositoryInterface {
    private Booking booking;

    public BookingRepositoryMock() {

    }

    @Override
    public Booking addBooking(int order, Tours tour, Time date, User users, int numOfPpl, PickUp pickUp, DropOff dropOff){
        return booking;
    }
}
