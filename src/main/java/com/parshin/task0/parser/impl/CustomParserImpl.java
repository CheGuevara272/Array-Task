package com.parshin.task0.parser.impl;

import com.parshin.task0.exception.CustomException;
import com.parshin.task0.parser.CustomParser;

public class CustomParserImpl implements CustomParser  {
    private static final String STRING_TO_INT_DELIMITER = "\\s+";
    private static final int DEFAULT_VALUE = 0;

    @Override
    public int[] convertStringToInts(String line) {
        line = line.strip();
        String[] numbers = line.split(STRING_TO_INT_DELIMITER);
        int length = numbers.length;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }
        return array;
    }
}
