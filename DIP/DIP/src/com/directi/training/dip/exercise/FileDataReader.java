package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataReader implements DataReader {
    private final String filePath;

    public FileDataReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder inputString = new StringBuilder();
        String aLine;
        while ((aLine = reader.readLine()) != null) {
            inputString.append(aLine);
        }
        reader.close();
        return inputString.toString();
    }
}
