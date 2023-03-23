// simulates fix at given location
public class BookingRepositoryMock implements BookingRepositoryInterface {
    private Booking booking;

    public BookingRepositoryMock() {
        this.lat = lat;
        this.lon = lon;
    }

    @Override
    public Booking addBooking(int order, Tours tour, Time date, User users, int numOfPpl, PickUp pickUp, DropOff dropOff){
        return booking;
    }
}
