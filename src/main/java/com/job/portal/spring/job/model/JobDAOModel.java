package com.job.portal.spring.job.model;

public class JobDAOModel {

    private int jobId;
    private String JobTitle;
    private String jobDescription;

    public JobDAOModel() {
    }

    public JobDAOModel(int jobId, String jobTitle, String jobDescription) {
        this.jobId = jobId;
        JobTitle = jobTitle;
        this.jobDescription = jobDescription;
    }

    public int getJobId() {

        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}
