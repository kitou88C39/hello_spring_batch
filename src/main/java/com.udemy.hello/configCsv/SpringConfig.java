package com.udemy.hello.configCsv;

import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.core.io.ClassPathResource;
import java.nio.charset.StandardCharsets;

import javax.sql.DataSource;

import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import com.udemy.hello.model.Employee; // Ensure this is correct

@Configuration
public class SpringConfig {
    private final JobLauncher jobLauncher;
    private final JobRepository jobRepository;
    private final PlatformTransactionManager transactionManager;

    @Value("${csv.path}")
    private Resource inputCSV;

    @Autowired
    private DataSource dataSource;

    private static final String INSER_EMP_SQL =
    "INSERT INTO employee(empNumber, empName, jobTitle,"
                "mgrNumber,hireDate)"

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

        BeanWrapperFieldSetMapper<Employee> beanWrapperFieldSetMapper = new BeanWrapperFieldSetMapper<Employee>();
        beanWrapperFieldSetMapper.setTargetType(Employee.class);

        DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
        String[] csvTitleArray = new String[] { "EmpNumber", "EmpName", "JobTitle", "mgrNumber", "HireDate" };
        tokenizer.setNames(csvTitleArray);

        DefaultLineMapper<Employee> lineMapper = new DefaultLineMapper<Employee>();
        lineMapper.setFieldSetMapper(beanWrapperFieldSetMapper);
        lineMapper.setLineTokenizer(tokenizer);

        reader.setLineMapper(lineMapper);
        return reader;
    }

    @Autowired
    @Qualifier("empItemProcessor")
    public ItemProcessor<Employee, Employee> empItemProcessor;

}