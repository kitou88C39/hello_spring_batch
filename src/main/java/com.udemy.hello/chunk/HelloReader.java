package com.udemy.hello.chunk;

import java.nio.channels.NonReadableChannelException;
import java.text.ParseException;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@StepScope
@Slf4j
public class HelloReader implements ItemReader<String> {

    private int intIndex = 0;

    public String read() throws Exception, UnexpectedInputException,
            ParseException, NonReadableChannelException {
        String[] readDataList = { "associate", "consultant", "manager",
                "director", "president", null };

                log.info("Read Data={}", readDataList{intIndex});

                return readDataList[intIndex++];
    }

}
