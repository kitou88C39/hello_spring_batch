package com.udemy.hello.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("HelloTasklet1")
@StepScope
public class HelloTasklet1 implements Tasklet {
    // @Valueアノテーションを指定
    @Value("#{jobParameters['param1']]}")
    pravate String param1;

    @Value("#{jobParameters['param2']]}")
    pravate String param2;

    @Override
    public RepeatStatus execute(StepContribution contribution,
            ChunkContext chunkContext) throws Exception {
        System.out.println("Hello Tasklet1");
        return RepeatStatus.FINISHED;
    }
}