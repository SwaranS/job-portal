package com.job.portal.spring.job.dao;


import com.job.portal.spring.job.model.CustomerDAOModel;
import org.springframework.stereotype.Service;

@Service
public class CustomerDAOImpl implements CustomerDAO {


    @Override
    public int insertCustomer(String firstName, String lastName, String middleName) {
        return 0;
    }

    @Override
    public CustomerDAOModel getCustomer(int customerId) {
        return null;
    }
}
