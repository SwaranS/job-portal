package com.job.portal.spring.job.dao;

import com.job.portal.spring.job.model.JobDAOModel;

public interface JobDAO {

    int insertJob(String title, String description, int companyId,int recruiterId);

    JobDAOModel getJob (int jobId);


}
