package com.udemy.hello.configCsv;

import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.batch.item.file.FlatFileItemReader;
import java.nio.charset.StandardCharsets;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;

@Configuration
public class SpringConfig {
    private final JobLauncher jobLauncher;
    private final JobRepository jobRepository;
    private final PlatformTransactionManager transactionManager;

    @Value("${csv.path}")
    private Resource inputCSV;

    public SpringConfig(JobLauncher jobLauncher, JobRepository jobRepository,
            PlatformTransactionManager transactionManager) {
        this.jobLauncher = jobLauncher;
        this.jobRepository = jobRepository;
        this.transactionManager = transactionManager;
    }

    @Bean
    @StepScope
    public FlatFileItemReader<Employee> csvItemReader() {

        FlatFileItemReader<Employee> reader = new FlatFileItemReader<Employee>();
        reader.setResouce(inputCSV);
        reader.setLinesToSkip(1);
        reader.setEncoding(StandardCharsets.UTF_8.name());

        DefaultLineMapper<Employee> lineMapper = new DefaultLineMapper<Employee>();
        lineMapper.setFieldSetMapper(null);
        lineMapper.setLineTokenizer(null);

        reader.setLineMapper(null);
        return reader;
    }
}