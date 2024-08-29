package com.udemy.hello.config;

import java.util.ArrayList;

import org.springframework.batch.core.launch.JobLauncher;

@Configuration
public class SpringConfig {
    private final JobLauncher jobLauncher;
    private final JobRepository jobRepository;
    private final PlatformTransactionManager platformTransactionManager;

    public SpringConfig(JobLauncher jobLauncher JobRepository jobRepository PlatformTransactionManager transactionManager){

    }

}
