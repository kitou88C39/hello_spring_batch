package com.udemy.hello.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class HelloTasklet1 implements Tasklet {
    @Override
    public RepeatStatus execute(StepCounteribution contribution,
            ChunkContext chunkContext) throws Exception {
        System.out.println("Hello Tasklet1");
        return RepeatStatus.FINISHED;
    }
}