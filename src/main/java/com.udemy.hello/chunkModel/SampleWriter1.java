package com.udemy.hello.chunkModel;

import org.apache.tomcat.jni.FileInfo;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SampleWriter1 implements ItemWriter<FileInfo> {

    private final FileRepository repository;

    @Override
    public void write(Chunk<? extends FileInfo> chunk) throws Exception {
        for (FileInfo processedFileInfo : chunk.getItems()) {
            try {
                repository.save(processedFileInfo);
            } catch (Exception e) {
                throw e;
            }
        }
    }
}
