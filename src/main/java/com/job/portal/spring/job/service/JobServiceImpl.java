package com.job.portal.spring.job.service;

import com.job.portal.spring.job.model.CustomerDAOModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    @Qualifier("customerDAO")
    private JobDAO jobDAO;

    public CustomerDAOModel getJob(int jobId) {
        return jobDAO.getJob(jobId);
    }

    public int insertJob(String title, String description, int companyId, int recruiterId) {

        return jobDAO.insertJob(title, description, companyId, recruiterId);
    }

}
