package com.job.portal.spring.job.service;

import com.job.portal.spring.job.dao.JobDAO;
import com.job.portal.spring.job.model.JobDAOModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    @Qualifier("jobDAOImpl")
    private JobDAO jobDAO;

    public JobDAOModel getJob(int jobId) {
        return jobDAO.getJob(jobId);
    }

    public int insertJob(String title, String description, int companyId, int recruiterId) {

        return jobDAO.insertJob(title, description, companyId, recruiterId);
    }

}
