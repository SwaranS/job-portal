package com.job.portal.spring.job.service;

import com.job.portal.spring.job.dao.CustomerDAO;
import com.job.portal.spring.job.model.CustomerDAOModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    @Qualifier("customerDAOImpl")
    private CustomerDAO customerDAO;


    @Override
    public CustomerDAOModel getCustomer(String customerId) {
        return null;
    }

    @Override
    public int insertCustomer(String first_name, String middle_name, String last_name, Date date_of_birth, char gender, String current_address, String email, int mobile_number) {
        return 0;
    }
}
