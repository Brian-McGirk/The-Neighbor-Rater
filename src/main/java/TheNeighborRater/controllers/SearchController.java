package TheNeighborRater.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("search")
public class SearchController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displaySearchForm(Model model){

        model.addAttribute("title", "Search");

        return "search/index";
    }

    @RequestMapping(value = "results", method = RequestMethod.GET)
    public String displaySearchResults(Model model){

        model.addAttribute("title", "Search");

        return "search/results";
    }

}
