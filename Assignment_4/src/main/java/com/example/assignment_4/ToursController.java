package com.example.assignment_4;

import java.util.List;

public class ToursController {

    private ToursRepository toursRepository;

    public ToursController(ToursRepository toursRepository) {
        this.toursRepository = toursRepository;
    }

    public void addTour(String title, String description, int price, String host, Location location, Time dateAndTime,
            int availability, int rating) {
        Tours tour = new Tours(title, description, price, host, location, dateAndTime, availability, rating);
        toursRepository.addTour(tour);
    }

    public List<Tours> getAllTours() {
        return toursRepository.getAllTours();
    }

    public Tours getTourByTitle(String title) {
        return toursRepository.getTourByTitle(title);
    }

    public void updateTour(String title, String description, int price, String host, Location location,
            Time dateAndTime, int availability, int rating) {
        Tours tour = toursRepository.getTourByTitle(title);
        if (tour != null) {
            tour.setDescription(description);
            tour.setPrice(price);
            tour.setHost(host);
            tour.setLocation(location);
            tour.setDateAndTime(dateAndTime);
            tour.setAvailability(availability);
            tour.setRating(rating);
            toursRepository.updateTour(tour);
        }
    }

    public List<Tours> searchTours(String query) {
        return toursRepository.searchTours(query);
    }
}
