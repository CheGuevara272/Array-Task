package com.parshin.task0.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumValidator {
    private static final String STRING_AS_ARRAY_OF_INTEGERS = "^[-?\\d+\\s+]+$"; //  Не получается сделать регулярное выражение, чтобы оно ещё отсекало числа с 10 или более цифрами
                                                                                 //  Если так написать ^[-?\\d{1,9}\\s+]+$ , то {1,9} этот фрагмент не работает из-за [...]
    private static final String STRING_AS_CORRECT_NUMBER = "^-?\\d{1,9}$";

    private NumValidator() {
    }

    public static boolean lineValidator(String line) {
        Pattern pattern = Pattern.compile(STRING_AS_ARRAY_OF_INTEGERS);
        Matcher matcher = pattern.matcher(line);

        return matcher.matches();
    }

    public static boolean numberValidator(String line) {
        Pattern pattern = Pattern.compile(STRING_AS_CORRECT_NUMBER);
        Matcher matcher = pattern.matcher(line);

        return matcher.matches();
    }
}
