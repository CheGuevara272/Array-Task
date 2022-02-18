package com.parshin.array.parser.impl;

import com.parshin.array.parser.CustomParser;

import java.util.ArrayList;
import java.util.List;

import static com.parshin.array.validator.NumValidator.numberValidator;

public class CustomParserImpl implements CustomParser  {
    private static final CustomParserImpl instance = new CustomParserImpl();
    private static final String STRING_TO_INT_DELIMITER = "\\s+";

    private CustomParserImpl(){
    }

    public static CustomParserImpl getInstance() {
        return instance;
    }

    @Override
    public int[] convertStringToInts(String line) {
        line = line.strip();
        String[] numbers = line.split(STRING_TO_INT_DELIMITER);
        List<Integer> intList = new ArrayList<>();
        for (String element: numbers) {
            if(numberValidator(element)){
                int current = Integer.parseInt(element);
                intList.add(current);
            }
        }
        return  intList.stream().mapToInt(i -> i).toArray();
    }
}
