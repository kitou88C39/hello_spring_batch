package com.udemy.hello.tasklet;

public class HelloTasklet2 {

    @Component("HelloTasklet1")
    @StepScope
    public class HelloTasklet2 implements Tasklet {

        @Override
        public RepeatStatus execute(StepContribution contribution,
                ChunkContext chunkContext) throws Exception {

            System.out.println("Hello Tasklet2");
            System.out.println("jobValue1=" + jobValue1);

            return RepeatStatus.FINISHED;
        }
    }
}
