package com.hellen.batch.demo.job;

import com.hellen.batch.demo.HellenBatchApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;


@Slf4j
public class TestJob extends HellenBatchApplicationTests {
    @Resource
    SimpleJobLauncher simpleJobLauncher;

    public JobParameters jobParameters;
    @Autowired
    Job importJob;

    @Test
    public void  testJob() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
        jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis()).toJobParameters();
        simpleJobLauncher.run(importJob, jobParameters);
    }
}
