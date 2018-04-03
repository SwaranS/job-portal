package com.job.portal.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hp on 4/3/2018.
 */
@Controller
public class JobDetailsController {

    @RequestMapping(path = "/job-details", method = RequestMethod.GET)
    public String createApplicant(Model model) {
        model.addAttribute("pageTitle", "Job Portal");
        return "job-details/job-details";
    }
}
