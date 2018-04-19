package com.job.portal.spring.controller;

import com.job.portal.spring.job.model.CustomerDAOModel;
import com.job.portal.spring.job.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;


/**
 * @author
 */
@Controller
public class CustomerCreateController {

    @Autowired
    @Qualifier("customerServiceImpl")
    private CustomerService customerServiceImpl;


    /**
     * @param customerId
     * @param firstName
     * @param middleName
     * @param lastName
     * @param dateOfBirth
     * @param gender
     * @param currentAddress
     * @param email
     * @param mobileNumber
     * @return
     * Expected example http://localhost:8080/create-job?jobTitle=Titlte&jobDescription=desc&companyId=1&recruiterId=2
     */
    @RequestMapping(path = "/create-job", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> createCustomer(@RequestParam ("customerId") int customerId,
                                                 @RequestParam("firstName") String firstName,
                                                 @RequestParam("middleName") String middleName,
                                                 @RequestParam("lastName") String lastName,
                                                 @RequestParam("dateOfBirth") Date dateOfBirth,
                                                 @RequestParam ("gender") char gender,
                                                 @RequestParam ("currentAddress") String currentAddress,
                                                 @RequestParam ("email") String email,
                                                 @RequestParam ("mobileNumber") int mobileNumber) {
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        int creationResponse = customerServiceImpl.insertCustomer(firstName,middleName,lastName, dateOfBirth, gender, currentAddress, email, mobileNumber);
        if (creationResponse == 1)
            return new ResponseEntity<>("Job Successfully Created", httpHeaders, HttpStatus.OK);

        return new ResponseEntity<>("Some Error Happened", httpHeaders, HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(path = "/create-skills", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> createSkill() {
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>("{\"successMessage\": \"Customer Created\"}", httpHeaders, HttpStatus.OK);
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
