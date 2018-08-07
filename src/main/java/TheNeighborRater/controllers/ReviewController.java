package TheNeighborRater.controllers;

import TheNeighborRater.models.Apartment;
import TheNeighborRater.models.Review;
import TheNeighborRater.models.data.ApartmentDao;
import TheNeighborRater.models.data.ReviewDao;
import TheNeighborRater.models.forms.AddReviewForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@Controller
@RequestMapping("review")
public class ReviewController {

    @Autowired
    private ReviewDao reviewDao;

    @Autowired
    private ApartmentDao apartmentDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayReviewForm(Model model, @RequestParam int apartmentId){


        model.addAttribute("title", "Review");
        model.addAttribute("form", new AddReviewForm(new Review(), apartmentId));



        return "review/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processReviewForm(Model model, @ModelAttribute AddReviewForm form, Errors errors){

        if(errors.hasErrors()){

            model.addAttribute("title", "Review");

            return "review/index";
        }

        Optional<Apartment> apartmentOptional = apartmentDao.findById(form.getApartmentId());
        Apartment apartment = apartmentOptional.get();

        Review review = form.getReview();

        review.setApartment(apartment);
        reviewDao.save(review);



        return "redirect:/apartment";
    }

}
