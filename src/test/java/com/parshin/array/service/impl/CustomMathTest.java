package com.parshin.array.service.impl;

import com.parshin.array.entity.CustomArray;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class CustomMathTest {
    public int[] testArray = {1, -10, 4, 37, -18, -20, 40};
    CustomMathImpl customMath = CustomMathImpl.getInstance();

    @Test
    public void testFindMax() {
        CustomArray customArray = new CustomArray(testArray);
        int expected = 40;
        int actual = customMath.findMax(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMin() {
        CustomArray customArray = new CustomArray(testArray);
        int expected = -20;
        int actual = customMath.findMin(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindAverage() {
        CustomArray customArray = new CustomArray(testArray);
        double expected = 4.8571;
        double actual = customMath.findAverage(customArray);
        assertEquals(actual, expected, 0.0001);
    }

    @Test
    public void testFindSum() {
        CustomArray customArray = new CustomArray(testArray);
        int expected = 34;
        int actual = customMath.findSum(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testSumNegative() {
        CustomArray customArray = new CustomArray(testArray);
        int expected = -48;
        int actual = customMath.sumNegative(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testCountNegative() {
        CustomArray customArray = new CustomArray(testArray);
        int expected = 3;
        int actual = customMath.countNegative(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testSumPositive() {
        CustomArray customArray = new CustomArray(testArray);
        int expected = 82;
        int actual = customMath.sumPositive(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testCountPositive() {
        CustomArray customArray = new CustomArray(testArray);
        int expected = 4;
        int actual = customMath.countPositive(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMaxStream() {
        CustomArray customArray = new CustomArray(testArray);
        int expected = 40;
        int actual = customMath.findMaxStream(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMinStream() {
        CustomArray customArray = new CustomArray(testArray);
        int expected = -20;
        int actual = customMath.findMinStream(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindAverageStream() {
        CustomArray customArray = new CustomArray(testArray);
        double expected = 4.8571;
        double actual = customMath.findAverageStream(customArray);
        assertEquals(actual, expected, 0.0001);
    }

    @Test
    public void testFindSumStream() {
        CustomArray customArray = new CustomArray(testArray);
        int expected = 34;
        int actual = customMath.findSumStream(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testCountNegativeStream() {
        CustomArray customArray = new CustomArray(testArray);
        long expected = 3;
        long actual = customMath.countNegativeStream(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testCountPositiveStream() {
        CustomArray customArray = new CustomArray(testArray);
        long expected = 4;
        long actual = customMath.countPositiveStream(customArray);
        assertEquals(actual, expected);
    }
}