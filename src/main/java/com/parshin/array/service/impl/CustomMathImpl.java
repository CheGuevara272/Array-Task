package com.parshin.array.service.impl;

import com.parshin.array.entity.CustomArray;
import com.parshin.array.service.CustomMath;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomMathImpl implements CustomMath {
    private static final Logger log = LogManager.getLogger();
    private static final CustomMathImpl instance = new CustomMathImpl();

    private CustomMathImpl(){
    }

    public static CustomMathImpl getInstance(){
        return instance;
    }

    @Override
    public int findMax(CustomArray array) {
        int maxNumber = array.getArray()[0];
        for (int i = 0; i <  array.getArray().length; i++) {
            if (maxNumber < array.getArray()[i]) {
                maxNumber = array.getArray()[i];
            }
        }
        log.log(Level.INFO, "Max number in the array = {}", maxNumber);

        return maxNumber;
    }

    @Override
    public int findMin(CustomArray array) {
        int minNumber = array.getArray()[0];
        for (int i = 0; i <  array.getArray().length; i++)
            if (minNumber > array.getArray()[i]) {
                minNumber = array.getArray()[i];
            }
        log.log(Level.INFO, "Min number in the array = {}", minNumber);

        return minNumber;
    }

    @Override
    public double findAverage(CustomArray array) {
        int sum = findSum(array);
        double average = (double) sum / array.getArray().length;
        log.log(Level.INFO, "Average value in the array = {}", average);

        return average;
    }

    @Override
    public int findSum(CustomArray array) {
        int sum = 0;
        for (int i = 0; i <  array.getArray().length; i++) {
            sum += array.getArray()[i];
        }
        log.log(Level.INFO, "Sum of numbers in the array = {}", sum);

        return sum;
    }

    @Override
    public int sumNegative(CustomArray array) {
        int sumNeg = 0;
        for (int i = 0; i <  array.getArray().length; i++) {
            if (array.getArray()[i] < 0)
                sumNeg += array.getArray()[i];
        }
        log.log(Level.INFO, "Sun of negatives in the array = {}", sumNeg);

        return sumNeg;
    }

    @Override
    public int countNegative(CustomArray array) {
        int countNeg = 0;
        for (int i = 0; i <  array.getArray().length; i++)  {
            if (array.getArray()[i] < 0)
                countNeg++;
        }
        log.log(Level.INFO, "Number of negatives in the array = {}", countNeg);

        return countNeg;
    }

    @Override
    public int sumPositive(CustomArray array) {
        int sumPos = 0;
        for (int i = 0; i <  array.getArray().length; i++) {
            if (array.getArray()[i] > 0)
                sumPos += array.getArray()[i];
        }
        log.log(Level.INFO, "Sum of positives in the array = {}", sumPos);

        return sumPos;
    }

    @Override
    public int countPositive(CustomArray array) {
        int countPos = 0;
        for (int i = 0; i <  array.getArray().length; i++) {
            if (array.getArray()[i] > 0)
                countPos++;
        }
        log.log(Level.INFO, "Number of positives in the array is {}", countPos);

        return countPos;
    }

    @Override
    public int findMaxStream(CustomArray array) {
        int[] tempArray = array.getArray();
        int maxNumber = Arrays.stream(tempArray).max().getAsInt();
        log.log(Level.INFO, "Min number in the array is {}", maxNumber);

        return maxNumber;
    }

    @Override
    public int findMinStream(CustomArray array) {
        int[] tempArray = array.getArray();
        int minNumber = Arrays.stream(tempArray).min().getAsInt();
        log.log(Level.INFO, "Min number in the array is {}", minNumber);

        return minNumber;
    }

    @Override
    public double findAverageStream(CustomArray array) {
        int[] tempArray = array.getArray();
        double average = Arrays.stream(tempArray).average().getAsDouble();
        log.log(Level.INFO, "Average value in the array is {}", average);

        return average;
    }

    @Override
    public int findSumStream(CustomArray array) {
        int[] tempArray = array.getArray();
        int result = Arrays.stream(tempArray).sum();
        log.log(Level.INFO, "find sum stream is {}", result);

        return result;
    }

    @Override
    public long countNegativeStream(CustomArray array) {
        int[] tempArray = array.getArray();
        long countNeg = Arrays.stream(tempArray).filter(a -> a < 0).count();
        log.log(Level.INFO, "Number of negatives in the array is {}", countNeg);

        return countNeg;
    }

    @Override
    public long countPositiveStream(CustomArray array) {
        int[] tempArray = array.getArray();
        long countPos = Arrays.stream(tempArray).filter(a -> a > 0).count();
        log.log(Level.INFO, "Number of positives in the array is {}", countPos);

        return countPos;
    }
}
