package com.parshin.task0.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumValidator {
    private static final String STRING_AS_ARRAY_OF_INTEGERS = "^[-?\\d+\\s]+$";

    private NumValidator() {
    }

    public static boolean lineValidator(String line) {
        Pattern pattern = Pattern.compile(STRING_AS_ARRAY_OF_INTEGERS);
        Matcher matcher = pattern.matcher(line);

        return matcher.matches();
    }
}
