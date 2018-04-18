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
    @Qualifier("customerDAO")
    private CustomerDAO customerDAO;

    public CustomerDAOModel getFirstName(String firstName) {
        return customerDAO.getFirstName(firstName);
    }

    public int insertJob(String title, String description, int companyId, int recruiterId) {

        return jobDAO.insertJob(title, description, companyId, recruiterId);
    }

    @Override
    public CustomerDAOModel getFirstName(String firstName) {
        return null;
    }

    @Override
    public CustomerDAOModel getMiddleName(String middleName) {
        return null;
    }

    @Override
    public CustomerDAOModel getLastName(String lastName) {
        return null;
    }

    @Override
    public int insertCustomer(String first_name, String middle_name, String last_name, Date date_of_birth, char gender, String current_address, String email, int mobile_number) {
        return 0;
    }
}
