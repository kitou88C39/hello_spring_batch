package com.udemy.hello.configCsv;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    private final JobLauncher jobLauncher;
    private final JobRepository jobRepository;
    private final PlatformTransactionManager transactionManager;
}
