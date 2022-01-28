package com.parshin.task0.parser.impl;

import com.parshin.task0.parser.CustomParser;

import static com.parshin.task0.validator.NumValidator.numberValidator;

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
            if (numberValidator(numbers[i])){
                array[i] = Integer.parseInt(numbers[i]);
            } else {
                array[i] = DEFAULT_VALUE;
            }
        }
        return array;
    }
}
