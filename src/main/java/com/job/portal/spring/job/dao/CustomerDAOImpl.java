package com.job.portal.spring.job.dao;


import com.job.portal.spring.job.model.CustomerDAOModel;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CustomerDAOImpl implements CustomerDAO {


    @Override
    public int insertCustomer(String first_name, String middle_name, String last_name, Date date_of_birth, char gender, String current_address, String email, int mobile_number) {
        return 0;
    }

    @Override
    public CustomerDAOModel getCustomer(int customerId) {
        return null;
    }
}
