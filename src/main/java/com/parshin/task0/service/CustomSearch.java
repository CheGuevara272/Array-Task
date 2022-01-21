package com.parshin.task0.service;

public class CustomSearch {
    public int maxNum(int[] array) {
        int maxNumber = array[0];
        for (int j : array)
            if (maxNumber <= j) {
                maxNumber = j;
            }
        return maxNumber;
    }
}
