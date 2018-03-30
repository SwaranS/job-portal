package com.job.portal.spring.controller.job.dao;

import com.job.portal.spring.controller.job.model.JobDAOModel;

import java.util.List;

public interface JobDAO {

    int insertJob(int jobId, int skillId);

    List<JobDAOModel> getJob (int jobId);


}
