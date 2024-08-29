package com.udemy.hello.config;

import java.util.ArrayList;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class SpringConfig {
    private final JobLauncher jobLauncher;
    private final JobRepository jobRepository;
    private final PlatformTransactionManager platformTransactionManager;

    @Autowired
    @Qualifier("HelloTasklet1")
    private Tasklet HelloTasklet1;

    public SpringConfig(JobLauncher jobLauncher, JobRepository jobRepository,
            PlatformTransactionManager transactionManager) {
        this.jobLauncher = jobLauncher;
        this.jobRepository = jobRepository;
        this.platformTransactionManager = transactionManager;
    }
}
