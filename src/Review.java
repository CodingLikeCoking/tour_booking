public class Review {
    private int number;
    private int rating;

    private Time date;

    private User user;

    private String comment;

    public Review(int number, int rating, Time date, User user, String comment) {
        this.number = number;
        this.rating = rating;
        this.date = date;
        this.user = user;
        this.comment = comment;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Time getDate() {
        return date;
    }

    public void setDate(Time date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
