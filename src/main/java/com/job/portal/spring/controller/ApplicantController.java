package com.job.portal.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hp on 4/3/2018.
 */
@Controller
public class ApplicantController {

    @RequestMapping(path = "/create-applicant", method = RequestMethod.GET)
    public String createApplicant(Model model) {
        model.addAttribute("pageTitle", "Job Portal");
        return "applicant/create-applicant";
    }
}
