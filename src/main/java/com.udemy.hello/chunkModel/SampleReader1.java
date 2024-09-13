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
    public ReceiveFileInfo read()
            throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if (lines == null) {
            try {
                lines = Files.readAllLines(Paths.get("C:/work/sample.csv"), Charset.forName("UTF-8"));
            } catch (Exception e) {
                throw new UnexpectedInputException("Error reading file", e);
            }
        }

        if (currentIndex < lines.size()) {
            String[] arrColumn = lines.get(currentIndex++).split(",");
            ReceiveFileInfo receiveFileInfo = new ReceiveFileInfo();
            // Set attributes to receiveFileInfo from arrColumn
            return receiveFileInfo;
        }
        return null; // Returning null indicates no more data
    }
}
