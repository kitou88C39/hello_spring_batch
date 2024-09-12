package com.udemy.hello.chunkModel;

import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

@Component
public class SampleReader1 implements ItemReader<ReceiveFileInfo> {

    List<String> lines = null;
    int currentIndex = 0;

}
