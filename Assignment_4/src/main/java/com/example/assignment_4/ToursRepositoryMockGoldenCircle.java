package com.example.assignment_4;

import java.util.ArrayList;

public class ToursRepositoryMockGoldenCircle implements ToursRepositoryInterface{
    public ArrayList<Tours> searchTours(String title, String description, int price, Time dates, String location) throws OfflineException{
        Location goldenCircleLocation = new Location("Iceland", "Southwest Iceland, Thingvellir National Park. The Geysir Geothermal Area. Gullfoss Waterfall", "Reykjavik");
        Time goldenCircleTime = new Time("2023-01-01", (10, 00, 30, 00) , 180);
        User goldenCircleUser = new User("Apple", "apple@gmail.com", "3546734");
        Review review = new Review(1, 1, goldenCircleTime, goldenCircleUser , "This is the best trip I've ever had!");
        Tours goldenCircleTours = new Tours("Golden Cicle", "Trip to Golden Cirlce, one of the most signiture place in Iceland", 15000, "Jeremy", goldenCircleLocation, goldenCircleTime, 3, review);
        ArrayList<Tours> tourList = new ArrayList<Tours>();
        tourList.add(goldenCircleTours);
        return tourList;
    }
    public Tours updateTours(Tours tours) throws OfflineException{

    }
}
