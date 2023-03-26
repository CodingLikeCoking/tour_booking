package com.example.assignment_4;

import java.util.ArrayList;

public class ToursRepositoryMockOffline implements ToursRepositoryInterface{
    public ArrayList<Tours> searchTours(String title, String description, int price, Time dates, String location) throws OfflineException{
        throw new OfflineException();
    }
    public Tours updateTours(Tours tours) throws OfflineException{
        throw new OfflineException();
    }
}
