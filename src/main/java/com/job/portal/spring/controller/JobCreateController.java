package com.job.portal.spring.controller;

import com.job.portal.spring.job.dao.JobDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author
 */
@Controller
public class JobCreateController {

    @Autowired
    private JobDAO JobDAOImpl;


    @RequestMapping(path = "/create-job/{userName}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> createJob(@PathVariable String userName) {
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        if (userName.equals("bobby"))
            return new ResponseEntity<>("{\"successMessage\": \"Skills Created\"}", httpHeaders, HttpStatus.OK);
        else
            return new ResponseEntity<>("{\"Not Auth\": \"Not Allowed to see page\"}", httpHeaders, HttpStatus.UNAUTHORIZED);

    }

    @RequestMapping(path = "/create-skills", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> createSkill() {
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>("{\"successMessage\": \"Skills Created\"}", httpHeaders, HttpStatus.OK);
    }

    @RequestMapping(path = "/create-job-example", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> createJobExample(@RequestParam("companyName") String companyName) {
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        if (companyName.equals("TCS"))
            return new ResponseEntity<>("{\"successMessage\": \"Skills Created\"}", httpHeaders, HttpStatus.OK);
        else
            return new ResponseEntity<>("{\"Not Auth\": \"Not Allowed to create JOb" +
                    "\"}", httpHeaders, HttpStatus.UNAUTHORIZED);
    }

}
