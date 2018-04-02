package com.job.portal.spring.job.dao;

import com.job.portal.spring.job.model.JobDAOModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class JobDAOImpl implements JobDAO {

    @Autowired
    @Qualifier(value = "mySqlTemplate")
    private JdbcTemplate mySqlTemplate;

    public final String GET_JOBS = "SELECT * FROM jobs WHERE id = ?";


    @Override
    public int insertJob(int jobId, int skillId) {
        return 0;
    }

    @Override
    public JobDAOModel getJob(int jobId) {
        Object[] params = {jobId};
        return (JobDAOModel) mySqlTemplate.queryForObject(GET_JOBS, params, new RowMapper() {
            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                return new JobDAOModel(resultSet.getInt("id"),
                        resultSet.getString("title"),resultSet.getString("description"));

            }
        });

    }




}
