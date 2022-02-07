package com.parshin.array.service.impl;

import com.parshin.array.entity.CustomArray;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CustomSortTest {
    public int[] testArray = {1, -10, 4, 40, -18, -20, 37};
    public int[] sortedTestArray = {-20, -18, -10, 1, 4, 37, 40};
    CustomArray customArray;
    CustomSortImpl customSort = CustomSortImpl.getInstance();

    @BeforeTest
    public void setUp() {
        customArray = new CustomArray(testArray);
    }

    @Test
    public void testBubbleSort() {
        CustomSortImpl customSort = CustomSortImpl.getInstance();
        int[] expected = sortedTestArray;
        customSort.bubbleSort(customArray);
        int[] actual = customArray.getArray();
        assertEquals(actual, expected);
    }

    @Test
    public void testSelectionSort() {
        CustomSortImpl customSort = CustomSortImpl.getInstance();
        int[] expected = sortedTestArray;
        customSort.selectionSort(customArray);
        int[] actual = customArray.getArray();
        assertEquals(actual, expected);
    }

    @Test
    public void testQuickSort() {
        CustomSortImpl customSort = CustomSortImpl.getInstance();
        int[] expected = sortedTestArray;
        customSort.quickSort(customArray);
        int[] actual = customArray.getArray();
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamSort() {
        CustomSortImpl customSort = CustomSortImpl.getInstance();
        int[] expected = sortedTestArray;
        customSort.streamSort(customArray);
        int[] actual = customArray.getArray();
        assertEquals(actual, expected);
    }
}