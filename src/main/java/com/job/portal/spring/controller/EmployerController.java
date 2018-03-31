package com.job.portal.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployerController {

    @RequestMapping(path = "/create-employer", method = RequestMethod.GET)
    public String createEmployer(Model model) {
        model.addAttribute("pageTitle", "Job Portal");
        return "employer/create-employer";
    }

    //TODO :Register Controller

}
