package com.parshin.task0.service.impl;

import com.parshin.task0.entity.CustomArray;
import com.parshin.task0.exception.CustomException;
import com.parshin.task0.service.CustomMath;

public class CustomMathImpl implements CustomMath {
    @Override
    public int findMax(CustomArray array) {
        int maxNumber = array.getNumbers()[0];
        for (int i = 0; i <  array.getNumbers().length; i++) {
            if (maxNumber < array.getNumbers()[i]) {
                maxNumber = array.getNumbers()[i];
            }
        }

        return maxNumber;
    }

    @Override
    public int findMin(CustomArray array) {
        int minNumber = array.getNumbers()[0];
        for (int i = 0; i <  array.getNumbers().length; i++)
            if (minNumber > array.getNumbers()[i]) {
                minNumber = array.getNumbers()[i];
            }
        return minNumber;
    }

    @Override
    public double findAverage(CustomArray array) {
        int sum = findSum(array);
        double result = sum / array.getNumbers().length;
        return result;
    }

    @Override
    public int findSum(CustomArray array) {
        int sum = 0;
        for (int i = 0; i <  array.getNumbers().length; i++) {
            sum += array.getNumbers()[i];
        }
        return sum;
    }

    @Override
    public int sumNegative(CustomArray array) {
        int sumNeg = 0;
        for (int i = 0; i <  array.getNumbers().length; i++) {
            if (array.getNumbers()[i] < 0)
                sumNeg += array.getNumbers()[i];
        }
        return sumNeg;
    }

    @Override
    public int countNegative(CustomArray array) {
        int countNeg = 0;
        for (int i = 0; i <  array.getNumbers().length; i++)  {
            if (array.getNumbers()[i] < 0)
                countNeg++;
        }
        return countNeg;
    }

    @Override
    public int sumPositive(CustomArray array) {
        int sumPos = 0;
        for (int i = 0; i <  array.getNumbers().length; i++) {
            if (array.getNumbers()[i] > 0)
                sumPos += array.getNumbers()[i];
        }
        return sumPos;
    }

    @Override
    public int countPositive(CustomArray array) {
        int countPos = 0;
        for (int i = 0; i <  array.getNumbers().length; i++) {
            if (array.getNumbers()[i] > 0)
                countPos++;
        }
        return countPos;
    }
}
