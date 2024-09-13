package com.udemy.hello.chunkModel;

import org.springframework.batch.item.ItemWriter;

public class SampleWriter1 implements ItemWriter<FileInfo> {

    private final FileRepository repository;

}
