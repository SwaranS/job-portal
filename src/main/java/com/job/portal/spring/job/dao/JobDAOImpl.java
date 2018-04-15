package com.job.portal.spring.job.dao;

import com.job.portal.spring.job.model.JobDAOModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.Types;

@Service
public class JobDAOImpl implements JobDAO {

    @Autowired
    @Qualifier(value = "mySqlTemplate")
    private JdbcTemplate mySqlTemplate;

    public final String GET_JOBS = "SELECT * FROM jobs WHERE id = ?";

    public final String INSERT_VACANCY = "INSERT INTO public.vacancy( title, description, companyid, recruiterid) VALUES ( ?, ?, ?, ?)";

    /**
     * Insert job in database
     * @param title
     * @param description
     * @param companyId
     * @param recruiterId
     * @return
     */
    @Override
    public int insertJob(String title, String description, int companyId, int recruiterId) {
        Object[] params = {title, description, companyId, recruiterId};
        int[] types = {Types.VARCHAR,Types.VARCHAR,Types.INTEGER,Types.INTEGER};
        return mySqlTemplate.update(INSERT_VACANCY, params, types);
    }

    @Override
    public JobDAOModel getJob(int jobId) {
        Object[] params = {jobId};
        return (JobDAOModel) mySqlTemplate.queryForObject(GET_JOBS, params, (resultSet, i)
                -> new JobDAOModel(resultSet.getInt("id"),
                resultSet.getString("title"), resultSet.getString("description")));

    }


}
