package net.runnerdave.controller;

import net.runnerdave.service.LatinoGigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by runnerdave on 26/06/17.
 */
@Controller
public class LatinoGigController {

    private LatinoGigService latinoGigService;

    @Autowired
    private LatinoGigController(LatinoGigService service) {
        this.latinoGigService = service;
    }

    @RequestMapping("/listLatinoGigs")
    public String listTickets(Model model) {
        model.addAttribute("pageTitle", "Latino Gig Guide");
        model.addAttribute("gigList", latinoGigService.getGigList());
        return "views/list";
    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
