package TheNeighborRater.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Review {

    @Id
    @GeneratedValue
    private int id;

    private String review;

    private int overallRating;

    private int noiseRating;

    private int wallThicknessRating;

    private int averageRating;

    @OneToMany
    @JoinColumn(name = "review_id")
    private List<Apartment> apartments = new ArrayList<>();

    public int getId() {
        return id;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(int overallRating) {
        this.overallRating = overallRating;
    }

    public int getNoiseRating() {
        return noiseRating;
    }

    public void setNoiseRating(int noiseRating) {
        this.noiseRating = noiseRating;
    }

    public int getWallThicknessRating() {
        return wallThicknessRating;
    }

    public void setWallThicknessRating(int wallThicknessRating) {
        this.wallThicknessRating = wallThicknessRating;
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }
}
