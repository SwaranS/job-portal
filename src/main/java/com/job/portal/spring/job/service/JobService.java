package com.job.portal.spring.job.service;

import com.job.portal.spring.job.model.CustomerDAOModel;

import java.util.Date;

public interface JobService {

    CustomerDAOModel getFirstName(String firstName);
    CustomerDAOModel getMiddleName(String middleName);
    CustomerDAOModel getLastName(String lastName);

    /**
     *
     * @param first_name
     * @param middle_name
     * @param last_name
     * @param date_of_birth
     * @param gender
     * @param current_address
     * @param email
     * @param mobile_number
     * @return
     */
    int insertCustomer(String first_name, String middle_name, String last_name, Date date_of_birth, char gender, String current_address, String email, int mobile_number);

}
