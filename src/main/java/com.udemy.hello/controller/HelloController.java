package com.udemy.hello.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private JobLauncher jobLauncher;
    private JobRepository jobRepository;
    private PlatformTransactionManager transactionManager;
}
