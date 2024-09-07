package com.udemy.hello.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    @Qualifier("helloJob")
    private Job job;

    @PostMapping("/launch")
    public void launchJob(@RequestBody JobLaunchRequest request) {
        JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
    }
}
