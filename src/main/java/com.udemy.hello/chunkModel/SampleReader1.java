package com.udemy.hello.chunkModel;

import java.text.ParseException;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

@Component
public class SampleReader1 implements ItemReader<ReceiveFileInfo> {

    List<String> lines = null;
    int currentIndex = 0;

    @Override
    public ReceiverFileInfo read() {
        throw Exception, UnexpectedInputException, ParseException, NonTransientResourceException{}
    
    }
}
