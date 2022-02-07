package com.parshin.array.util;

public class CustomArrayCounter {
    private static int arrayCount;

    private CustomArrayCounter() {
        throw new IllegalStateException("Utility class");
    }

    public static int getArrayCount() {
        arrayCount++;
        return arrayCount;
    }
}
