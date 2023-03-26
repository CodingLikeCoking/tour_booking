package com.example.assignment_4;

import java.util.ArrayList;

public interface ToursRepositoryInterface {
    public ArrayList<Tours> searchTours(String title, String description, int price, Time dates, String location) throws OfflineException;
    public Tours updateTours(Tours tours) throws OfflineException;
}
