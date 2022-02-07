package com.parshin.array.service;

import com.parshin.array.entity.CustomArray;

public interface CustomMath {
    int findMax(CustomArray array);
    int findMin(CustomArray array);
    double findAverage(CustomArray array);
    int findSum(CustomArray array);
    int sumNegative(CustomArray array);
    int countNegative(CustomArray array);
    int sumPositive(CustomArray array);
    int countPositive(CustomArray array);


    int findMaxStream(CustomArray customArray);
    int findMinStream(CustomArray customArray);
    double findAverageStream(CustomArray customArray);
    int findSumStream(CustomArray customArray);
    long countPositiveStream(CustomArray customArray);
    long countNegativeStream(CustomArray customArray);
}
