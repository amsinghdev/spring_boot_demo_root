package com.amit.web;

import com.amit.service.ApplicationService;
import com.amit.service.ReleaseService;
import com.amit.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TzlController
{
    private ApplicationService applicationService;
    private TicketService ticketService;
    private ReleaseService releaseService;

    @Autowired
    public void setApplicationService(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }
    @Autowired
    public void setTicketService(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    @Autowired
    public void setReleaseService(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }

    @GetMapping("/applications")
    public String retriveApplication(Model model)
    {
        model.addAttribute("applications",applicationService.listApplications());
        return "applications";
    }

    @GetMapping("/tickets")
    public String retriveTicket(Model model)
    {
        model.addAttribute("tickets",ticketService.listTickets());
        return "tickets";
    }

    @GetMapping("releases")
    public String retriveRelease(Model model)
    {
        model.addAttribute("releases",releaseService.listReleases());
        return "releases";
    }


}
