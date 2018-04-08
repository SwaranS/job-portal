package com.job.portal.spring.job.service;

import com.job.portal.spring.job.model.JobDAOModel;

public interface JobService {

    JobDAOModel getJob(int jobId);

}
