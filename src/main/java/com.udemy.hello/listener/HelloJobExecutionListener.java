package com.udemy.hello.listener;

import org.springframework.batch.core.JobExecutionListener;

public class HelloJobExecutionListener implements JobExecutionListener {

    @Override
    public void beforeJob(JobExecution jobExecution) {

        JobExecutionListener.super.beforeJob(jobExecution);
    }

    @Override
    public void beforeJob(JobExecution jobExecution) {

        JobExecutionListener.super.beforeJob(jobExecution);
    }
}
