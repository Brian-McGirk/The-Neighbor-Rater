package TheNeighborRater.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("apartment")
public class ApartmentController {

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddForm(Model model){

        model.addAttribute("title", "Add");

        return "apartment/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddForm(Model model){

        model.addAttribute("title", "Add");

        return "apartment/results";
    }

}
