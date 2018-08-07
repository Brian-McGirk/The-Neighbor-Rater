package TheNeighborRater.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Review {

    @Id
    @GeneratedValue
    private int id;

    private String reviewDescription;

//    private int overallRating;
//
//    private int noiseRating;
//
//    private int wallThicknessRating;
//
//    private int averageRating;

    @ManyToOne
    private Apartment apartment;

    public Review() {
    }

    public int getId() {
        return id;
    }

    public String getReviewDescription() {
        return reviewDescription;
    }

    public void setReviewDescription(String reviewDescription) {
        this.reviewDescription = reviewDescription;
    }

//    public int getOverallRating() {
//        return overallRating;
//    }
//
//    public void setOverallRating(int overallRating) {
//        this.overallRating = overallRating;
//    }
//
//    public int getNoiseRating() {
//        return noiseRating;
//    }
//
//    public void setNoiseRating(int noiseRating) {
//        this.noiseRating = noiseRating;
//    }
//
//    public int getWallThicknessRating() {
//        return wallThicknessRating;
//    }
//
//    public void setWallThicknessRating(int wallThicknessRating) {
//        this.wallThicknessRating = wallThicknessRating;
//    }
//
//    public int getAverageRating() {
//        return averageRating;
//    }
//
//    public void setAverageRating(int averageRating) {
//        this.averageRating = averageRating;
//    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }
}
