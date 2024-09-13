package com.udemy.hello.chunkModel;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.stereotype.Component;

@Component
public class SampleReader1 implements ItemReader<ReceiveFileInfo> {

    private List<String> lines = null;
    private int currentIndex = 0;

    @Override
    public ReceiverFileInfo read()
            throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

        if (lines == null) {
            try {
                lines = Files.readAllLines(Paths.get("C:/work/sample.csv"), Charset.forName("UTF-8"));
            } catch (Exception e) {
                throw new UnexpectedInputException("Error reading file", e);
            }
        }

        if (currentIndex < lines.size()) {
            var arrColumn = lines.get(currentIndex++).split(",");
            var receiveFileInfo = new ReceiveFileInfo();
            receiveFileInfo.setId(arrColumn[0]);
            receiveFileInfo.setName(arrColumn[1]);
            receiveFileInfo.setAge(Integer.parseInt(arrColumn[2]));

            return receiveFileInfo;
        }
        return null;
    }
}
