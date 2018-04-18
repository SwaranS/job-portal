package com.job.portal.spring.controller;

import com.job.portal.spring.job.model.CustomerDAOModel;
import com.job.portal.spring.job.service.JobService;
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


/**
 * @author
 */
@Controller
public class JobCreateController {

    @Autowired
    @Qualifier("jobServiceImpl")
    private JobService jobServiceImpl;


    /**
     * @param jobTitle
     * @param jobDescription
     * @param companyId
     * @param recruiterId
     * @return
     * Expected example http://localhost:8080/create-job?jobTitle=Titlte&jobDescription=desc&companyId=1&recruiterId=2
     */
    @RequestMapping(path = "/create-job", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> createJob(@RequestParam("jobTitle") String jobTitle,
                                            @RequestParam("jobDescription") String jobDescription,
                                            @RequestParam("companyId") int companyId,
                                            @RequestParam("recruiterId") int recruiterId) {
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        int creationResponse = jobServiceImpl.insertJob(jobTitle, jobDescription, companyId, recruiterId);
        if (creationResponse == 1)
            return new ResponseEntity<>("Job Successfully Created", httpHeaders, HttpStatus.OK);

        return new ResponseEntity<>("Some Error Happened", httpHeaders, HttpStatus.BAD_REQUEST);
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

    @RequestMapping(path = "/get-job", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> getJobExample(@RequestParam("jobIId") int jobId) {
        final HttpHeaders httpHeaders = new HttpHeaders();
        CustomerDAOModel customerDAOModel = jobServiceImpl.getJob(jobId);
        System.out.println("Job Desc from DB " + customerDAOModel.getJobDescription());
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>("{\"Job Title\": \"Not Allowed to create JOb" +
                "\"}", httpHeaders, HttpStatus.OK);
    }


}
