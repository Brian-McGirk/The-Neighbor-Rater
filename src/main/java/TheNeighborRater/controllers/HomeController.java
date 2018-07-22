package TheNeighborRater.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("home")
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayHome(Model model){

        model.addAttribute("title", "Search");

        return ("home/index");
    }

}
