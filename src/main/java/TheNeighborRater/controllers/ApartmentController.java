package TheNeighborRater.controllers;

import TheNeighborRater.models.Apartment;
import TheNeighborRater.models.data.ApartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("apartment")
public class ApartmentController {

    @Autowired
    private ApartmentDao apartmentDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model){

        model.addAttribute("title", "Home");
        model.addAttribute("apartments", apartmentDao.findAll());

        return "apartment/display";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddForm(Model model){

        model.addAttribute("title", "Add");
        model.addAttribute(new Apartment());

        return "apartment/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddForm(Model model, @ModelAttribute Apartment apartment, Errors errors,
                                 RedirectAttributes redirectAttributes){

        if(errors.hasErrors()){

            model.addAttribute("title", "Add");
            model.addAttribute(apartment);

            return "apartment/index";
        }

        apartmentDao.save(apartment);

        model.addAttribute("title", "Add");
        redirectAttributes.addAttribute("apartmentId", apartment.getId());

        return "redirect:/review";
    }

}
