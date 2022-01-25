package com.parshin.task0.service;

import com.parshin.task0.entity.CustomArray;
import com.parshin.task0.exception.CustomException;

public interface CustomMath {
    int findMax(CustomArray array);
    int findMin(CustomArray array);
    double findAverage(CustomArray array);
    int findSum(CustomArray array);
    int sumNegative(CustomArray array);
    int countNegative(CustomArray array);
    int sumPositive(CustomArray array);
    int countPositive(CustomArray array);
}
