package com.parshin.array.util;

public class CustomArrayIdGenerator {
    private static int arrayCount;

    private CustomArrayIdGenerator() {
        throw new IllegalStateException("Utility class");
    }

    public static int generateId() {
        arrayCount++;
        return arrayCount;
    }
}
