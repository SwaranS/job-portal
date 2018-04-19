package com.job.portal.spring.job.dao;

import com.job.portal.spring.job.model.CustomerDAOModel;

import java.util.Date;

public interface CustomerDAO  {

    int insertCustomer(String first_name, String middle_name, String last_name, Date date_of_birth, char gender, String current_address, String email, int mobile_number);

    CustomerDAOModel getCustomer (int customerId);


}
