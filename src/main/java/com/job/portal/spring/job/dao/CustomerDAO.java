package com.job.portal.spring.job.dao;

import com.job.portal.spring.job.model.CustomerDAOModel;

public interface CustomerDAO  {

    int insertCustomer(String first_name, String last_name, String middle_name);

    CustomerDAOModel getCustomer (int customerId);


}
