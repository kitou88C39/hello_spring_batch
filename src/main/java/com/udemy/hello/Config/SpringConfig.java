package com.udemy.hello.config;

import java.util.ArrayList;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    private final JobLauncher jobLauncher;
    private final JobRepository jobRepository;
    private final PlatformTransactionManager platformTransactionManager;

    public SpringConfig(JobLauncher jobLauncher, JobRepository jobRepository,
            PlatformTransactionManager transactionManager) {
        this.jobLauncher = jobLauncher;
        this.jobRepository = jobRepository;
        this.platformTransactionManager = transactionManager;
    }

}
