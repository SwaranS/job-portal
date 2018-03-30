package com.job.portal.spring.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 
 */
@Controller
public class HelloWorldController {
   
   @RequestMapping(path={"/"},method=RequestMethod.GET)
   public String sayHello(Model model) {
      model.addAttribute("pageTitle", "Job Portal");
      
      return "index";
   }



}
