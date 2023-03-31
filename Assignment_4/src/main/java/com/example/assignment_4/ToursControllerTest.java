package com.example.assignment_4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ToursControllerTest {

    private ToursController toursController;

    @BeforeAll
    public void setUp() {
        ToursRepository toursRepository = new ToursRepository();
        toursController = new ToursController(toursRepository);
    }

    @Test
    public void addTour() {
        String title1 = "Leikhús";
        String description1 = "máttulegir fær frábæra dóma";
        int price1 = 100;
        String host1 = "Borgarleikhúsið";
        Location location1 = new Location("Iceland", "Listavegur 3", "Reykjavik");
        Time dateAndTime1 = new Time(2023, 4, 5, "20:00");
        int availability1 = 25;
        int rating1 = 5;

        toursController.addTour(title1, description1, price1, host1, location1, dateAndTime1, availability1, rating1);

        Tours tour = toursController.getTourByTitle(title1);
        assertNotNull(tour);
        assertEquals(title1, tour.getTitle());
        assertEquals(description1, tour.getDescription());
        assertEquals(price1, tour.getPrice());
        assertEquals(host1, tour.getHost());
        assertEquals(location1, tour.getLocation());
        assertEquals(dateAndTime1, tour.getDateAndTime());
        assertEquals(availability1, tour.getAvailability());
        assertEquals(rating1, tour.getRating());
    }

    @Test
    void getAllTours() {
        List<Tours> tours = toursController.getAllTours();
        assertNotNull(tours);
        assertFalse(tours.isEmpty());
    }

    @Test
    void getTourByTitle() {
        String title = "Leikhús";
        Tours tour = toursController.getTourByTitle(title);
        assertNotNull(tour);
        assertEquals(title, tour.getTitle());
    }

    @Test
    void updateTour() {
        String title = "Leikhúsið";
        Tours tour = toursController.getTourByTitle(title);
        assertNotNull(tour);

        String newDescription = "Hvað sem þið viljið í þjóðleikhúsinu";
        int newPrice = 200;
        String newHost = "Þjóðleikhúsið";
        Location newLocation = new Location("Iceland", "Hverfisgata 19", "Rekjavik");
        Time newDateAndTime = new Time(4, 2023, 15, "20:30");
        int newAvailability = 5;
        int newRating = 4;

        toursController.updateTour(title, newDescription, newPrice, newHost, newLocation, newDateAndTime,
                newAvailability, newRating);

        Tours updatedTour = toursController.getTourByTitle(title);
        assertNotNull(updatedTour);
        assertEquals(newDescription, updatedTour.getDescription());
        assertEquals(newPrice, updatedTour.getPrice());
        assertEquals(newHost, updatedTour.getHost());
        assertEquals(newLocation, updatedTour.getLocation());
        assertEquals(newDateAndTime, updatedTour.getDateAndTime());
        assertEquals(newAvailability, updatedTour.getAvailability());
        assertEquals(newRating, updatedTour.getRating());
    }

    @Test
    void searchTours() {
        String Leita = "Leikhúsið";
        List<Tours> tours = toursController.searchTours(Leita);
        assertNotNull(tours);
        assertFalse(tours.isEmpty());
        for (Tours tour : tours) {
            assertTrue(tour.getTitle().contains(Leita));
        }
    }

}
