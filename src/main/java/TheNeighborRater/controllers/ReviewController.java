package TheNeighborRater.controllers;

import TheNeighborRater.models.Review;
import TheNeighborRater.models.data.ReviewDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("review")
public class ReviewController {

    @Autowired
    private ReviewDao reviewDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayReviewForm(Model model){

        model.addAttribute("title", "Review");
        model.addAttribute(new Review());


        return "review/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processReviewForm(Model model, @ModelAttribute Review review, Errors errors){

        if(errors.hasErrors()){

            model.addAttribute("title", "Review");
            model.addAttribute(review);

            return "review/index";
        }

        model.addAttribute("title", "Review");

        reviewDao.save(review);

        return "redirect:";
    }

}
