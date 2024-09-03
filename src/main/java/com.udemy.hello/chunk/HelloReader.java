package com.udemy.hello.chunk;

import java.nio.channels.NonReadableChannelException;
import java.text.ParseException;

import org.springframework.batch.item.UnexpectedInputException;

public class HelloReader implements IntemReader<String> {

    private int intIndex = 0;

    public String read() throws Exception, UnexpectedInputException,
            ParseException, NonReadableChannelException {
    }

}
