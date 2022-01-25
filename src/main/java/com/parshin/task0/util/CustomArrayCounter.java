package com.parshin.task0.util;

public class CustomArrayCounter {
    static int arrayCount = 0;

    private CustomArrayCounter() {
        throw new IllegalStateException("Utility class");
    }

    public static void incrementArrayCounter() {
        arrayCount++;
    }

    public static int getArrayCount() {
        return arrayCount;
    }
}
