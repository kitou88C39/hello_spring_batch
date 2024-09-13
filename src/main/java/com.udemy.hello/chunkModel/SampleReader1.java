package com.udemy.hello.chunkModel;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

@Component
public class SampleReader1 implements ItemReader<ReceiveFileInfo> {

    List<String> lines = null;
    int currentIndex = 0;

    @Override
    public ReceiverFileInfo read() {
        throw Exception, UnexpectedInputException, ParseException, NonTransientResourceException{

            If(lines == null){
                try{
                    lines = Files.readAllLines(Paths.get("C:¥¥work¥¥sample.csv"),Charset.forName("UTF-8"));
                }catch(Exception e){
                throw e;
                }        
            }

            if(currentIndex < lines.size()){

            }
return ReceiveFileInfo;
        }
    return null;
    }
}
