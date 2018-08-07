package TheNeighborRater.models.forms;


import TheNeighborRater.models.Apartment;
import TheNeighborRater.models.Review;

public class AddReviewForm {

    private Review review;

    private int apartmentId;

    public AddReviewForm() {
    }

    public AddReviewForm(Review review, int apartmentId){
        this.review = review;
        this.apartmentId = apartmentId;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }
}
