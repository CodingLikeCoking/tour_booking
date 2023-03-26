package com.example.assignment_4;

import java.util.ArrayList;

public class ToursRepositoryMockNoToursFound implements ToursRepositoryInterface{
    public ArrayList<Tours> searchTour(String title, String description, int price, Time dates, String location) throws OfflineException{
        return null;
    }
    public Tours updateTour(Tours tours) throws OfflineException{
        return null;
    }
}
