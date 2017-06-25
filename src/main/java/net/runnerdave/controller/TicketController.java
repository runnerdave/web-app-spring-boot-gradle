package net.runnerdave.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by runnerdave on 26/06/17.
 */
@Controller
@RequestMapping("/tickets")
public class TicketController {

    @RequestMapping("/listTickets")
    public String listTickets() {
        return "views/list";
    }
}
