package com.udemy.hello.chunkModel;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class SampleProcessor implements ItemProcessor<ReceiveFileInfo, Fileinfo> {

}
