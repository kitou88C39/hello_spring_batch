package com.udemy.hello.chuckCsv;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.udemy.hello.model.Employee;

import lombok.extern.slf4j.Slf4j;

@Component("EmpItemProcessor")
@StepScope
@Slf4j
public class EmpItemProcessor implements ItemProcessor<Employee, Employee> {
    public Employee process(Employee item) throws Exception {
        return null;
    }

}
