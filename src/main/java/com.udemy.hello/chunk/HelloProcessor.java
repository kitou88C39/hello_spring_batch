package com.udemy.hello.chunk;

import org.springframework.batch.item.ItemProcessor;

public class HelloProcessor implements ItemProcessor<String, String> {

    @Override
    public String process(String item) throws Exception {

        item = item.toUpperCase();
        log.info("Processor item={}", item);
        return item;
    }

}
