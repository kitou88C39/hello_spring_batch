package com.udemy.hello.validator;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.JobParametersValidator;

public class HelloJobParametersValidator implements JobParametersValidator {

    @Override
    public void validate(JobParameters parameters)
            throws JobParametersInvalidException {
        // パラメータの値チェック
        String param1 = parameters.getString("param1");
        if (!param1.equals("DEV") &&
                !param1.equals("TEST") &&
                !param1.equals("PROD")) {
        }
    }
}