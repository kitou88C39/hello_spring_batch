package com.udemy.hello.chunkModel;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class SampleProcessor implements ItemProcessor<ReceiveFileInfo, FileInfo> {

    @Override
    public FileInfo process(ReceiveFileInfo item) throws Exception {
        var processedFileInfo = new FileInfo();
        processedFileInfo.setId(item.getId());
        processedFileInfo.setId(item.getId());
        processedFileInfo.setId(item.getId());
        processedFileInfo.setId(item.getId());
    }

}
