package com.job.portal.spring.job.service;

import com.job.portal.spring.job.model.JobDAOModel;

public interface JobService {

    JobDAOModel getJob(int jobId);

    /**
     *
     * @param title
     * @param description
     * @param companyId
     * @param recruiterId
     * @return
     */
    int insertJob(String title, String description, int companyId,int recruiterId);

}
