package TheNeighborRater.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Review {

    @Id
    @GeneratedValue
    private int id;

    private String review;

    private int rating;

    private int noiseRating;

    private int wallThicknessRating;

    public int getId() {
        return id;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
