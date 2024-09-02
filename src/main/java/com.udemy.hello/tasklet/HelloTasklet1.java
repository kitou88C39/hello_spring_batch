package com.udemy.hello.tasklet;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component("HelloTasklet1")
@StepScope
@Slf4j
public class HelloTasklet1 implements Tasklet {
    // @Valueアノテーションを指定
    @Value("#{jobParameters['param1']}")
    private String param1;

    @Value("#{jobParameters['param2']}")
    private Integer param2;

    @Override
    public RepeatStatus execute(StepContribution contribution,
            ChunkContext chunkContext) throws Exception {

        log.info("Hello Tasklet1");
        log.info("param1={}", param1); // パラメータ埋め込み修正
        log.info("param2={}", param2); // パラメータ埋め込み修正

        // System.out.println("Hello Tasklet1");
        // System.out.println("param1=" + param1);
        // System.out.println("param2=" + param2);

        // JobExecutionContextを取得
        ExecutionContext jobContext = contribution.getStepExecution()
                .getJobExecution()
                .getExecutionContext();
        jobContext.put("jobKey1", "jobValue1");

        return RepeatStatus.FINISHED;
    }
}