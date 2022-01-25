package com.parshin.task0.reader.impl;

import com.parshin.task0.exception.CustomException;
import com.parshin.task0.reader.CustomReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static com.parshin.task0.validator.NumValidator.lineValidator;

public class CustomReaderImpl implements CustomReader {

    @Override
    public String readFile(String fileName) throws CustomException {
        String line = null;
        List<String> lineList = new ArrayList<>();
        StringBuilder finalString = new StringBuilder();
        File file = new File(fileName);

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((line = reader.readLine()) != null) {
                if (lineValidator(line)) {
                    lineList.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new CustomException("Can not find file \"" + file.getAbsolutePath() + "\"", e);
        } catch (IOException e) {
            throw new CustomException("Error while reading file", e);
        }

        for (String str : lineList) {
            finalString.append(str);
        }
        return finalString.toString();
    }
}
