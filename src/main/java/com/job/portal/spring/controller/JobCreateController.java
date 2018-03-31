package com.job.portal.spring.controller;

import com.job.portal.spring.job.dao.JobDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author
 */
@Controller

public class JobCreateController {

    @Autowired
    private JobDAO JobDAOImpl;

    @RequestMapping(path = "/create-job", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> createJob() {
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        System.out.println(JobDAOImpl.getJob(1));
        return new ResponseEntity<>("{\"successMessage\": \"Skills Created\"}", httpHeaders, HttpStatus.OK);
    }

    @RequestMapping(path = "/create-skills", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> createSkill() {
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>("{\"successMessage\": \"Skills Created\"}", httpHeaders, HttpStatus.OK);
    }

}
