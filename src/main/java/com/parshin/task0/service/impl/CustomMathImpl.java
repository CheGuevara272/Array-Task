package com.parshin.task0.service.impl;

import com.parshin.task0.entity.CustomArray;
import com.parshin.task0.service.CustomMath;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomMathImpl implements CustomMath {
    private static final Logger log = LogManager.getLogger();
    @Override
    public int findMax(CustomArray array) {
        int maxNumber = array.getArray()[0];
        for (int i = 0; i <  array.getArray().length; i++) {
            if (maxNumber < array.getArray()[i]) {
                maxNumber = array.getArray()[i];
            }
        }
        log.log(Level.INFO, "Max number in the " + array.toString() + " = " + maxNumber);

        return maxNumber;
    }

    @Override
    public int findMin(CustomArray array) {
        int minNumber = array.getArray()[0];
        for (int i = 0; i <  array.getArray().length; i++)
            if (minNumber > array.getArray()[i]) {
                minNumber = array.getArray()[i];
            }
        log.log(Level.INFO, "Min number in the " + array.toString() + " = " + minNumber);

        return minNumber;
    }

    @Override
    public double findAverage(CustomArray array) {
        int sum = findSum(array);
        double average = sum / array.getArray().length;
        log.log(Level.INFO, "Average value in the " + array.toString() + " = " + average);

        return average;
    }

    @Override
    public int findSum(CustomArray array) {
        int sum = 0;
        for (int i = 0; i <  array.getArray().length; i++) {
            sum += array.getArray()[i];
        }
        log.log(Level.INFO, "Sum of numbers in the " + array.toString() + " = " + sum);

        return sum;
    }

    @Override
    public int sumNegative(CustomArray array) {
        int sumNeg = 0;
        for (int i = 0; i <  array.getArray().length; i++) {
            if (array.getArray()[i] < 0)
                sumNeg += array.getArray()[i];
        }
        log.log(Level.INFO, "Sun of negatives in the " + array.toString() + " = " + sumNeg);

        return sumNeg;
    }

    @Override
    public int countNegative(CustomArray array) {
        int countNeg = 0;
        for (int i = 0; i <  array.getArray().length; i++)  {
            if (array.getArray()[i] < 0)
                countNeg++;
        }
        log.log(Level.INFO, "Number of negatives in the " + array.toString() + " = " + countNeg);

        return countNeg;
    }

    @Override
    public int sumPositive(CustomArray array) {
        int sumPos = 0;
        for (int i = 0; i <  array.getArray().length; i++) {
            if (array.getArray()[i] > 0)
                sumPos += array.getArray()[i];
        }
        log.log(Level.INFO, "Sum of positives in the " + array.toString() + " = " + sumPos);

        return sumPos;
    }

    @Override
    public int countPositive(CustomArray array) {
        int countPos = 0;
        for (int i = 0; i <  array.getArray().length; i++) {
            if (array.getArray()[i] > 0)
                countPos++;
        }
        log.log(Level.INFO, "Number of positives in the " + array.toString() + " = " + countPos);

        return countPos;
    }
}
