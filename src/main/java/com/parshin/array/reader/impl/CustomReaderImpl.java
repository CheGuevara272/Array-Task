package com.parshin.array.reader.impl;

import com.parshin.array.exception.CustomException;
import com.parshin.array.reader.CustomReader;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static com.parshin.array.validator.NumValidator.lineValidator;

public class CustomReaderImpl implements CustomReader {
    private static final CustomReaderImpl instance = new CustomReaderImpl();

    private CustomReaderImpl(){
    }

    public static CustomReaderImpl getInstance() {
        return instance;
    }

    @Override
    public List<String> readFile(String fileName) throws CustomException {
        String line;
        List<String> lineList = new ArrayList<>();
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
        return lineList;
    }
}
