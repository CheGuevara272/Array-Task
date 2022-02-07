package com.parshin.array.parser.impl;

import com.parshin.array.parser.CustomParser;

import static com.parshin.array.validator.NumValidator.numberValidator;

public class CustomParserImpl implements CustomParser  {
    private static final CustomParserImpl instance = new CustomParserImpl();
    private static final String STRING_TO_INT_DELIMITER = "\\s+";
    private static final int DEFAULT_VALUE = 0;

    private CustomParserImpl(){
    }

    public static CustomParserImpl getInstance() {
        return instance;
    }

    @Override
    public int[] convertStringToInts(String line) {
        line = line.strip();
        String[] numbers = line.split(STRING_TO_INT_DELIMITER);
        int length = numbers.length;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            if (numberValidator(numbers[i])){
                array[i] = Integer.parseInt(numbers[i]);
            } else {
                array[i] = DEFAULT_VALUE;
            }
        }
        return array;
    }
}
