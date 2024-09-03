package com.udemy.hello.chunk;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

public class HelloWriter implements ItemWriter<String> {

    @Override
    public void write(Chunk<? extends String> chunk)
            throws Exception {
        log.info("Writer chunk={}", chunk);
        log.info("-----------------");
    }

}
