package com.job.portal.spring.job.dao;

import com.job.portal.spring.job.model.JobDAOModel;

public interface JobDAO {

    int insertJob(int jobId, int skillId);

    JobDAOModel getJob (int jobId);


}
