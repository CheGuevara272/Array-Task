package com.parshin.array.service.impl;

import com.parshin.array.entity.CustomArray;
import com.parshin.array.service.CustomSort;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;
import java.util.stream.IntStream;

public class CustomSortImpl implements CustomSort {
    private static final CustomSortImpl instance = new CustomSortImpl();
    private static final Logger log = LogManager.getLogger();

    private CustomSortImpl(){
    }

    public static CustomSortImpl getInstance() {
        return instance;
    }

    @Override
    public void bubbleSort(CustomArray array) {
        int[] tempArray = array.getArray();

        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 1; j < (tempArray.length - i); j++) {
                if (tempArray[j - 1] > tempArray[j]) {
                    swap(tempArray, j - 1, j);
                }
            }
        }
        array.setArray(tempArray);
        log.log(Level.INFO, "CustomArray has been sorted: {}", array.toString());
    }

    @Override
    public void selectionSort (CustomArray array){
        int min;
        int[] tempArray = array.getArray();
        for (int index = 0; index < tempArray.length-1; index++){
            min = index;
            for (int scan = index+1; scan < tempArray.length; scan++) {
                if (tempArray[scan] < tempArray[min])
                    min = scan;
            }
            swap(tempArray,min, index);
        }
        array.setArray(tempArray);
        log.log(Level.INFO, "CustomArray has been sorted: {}", array.toString());
    }

    @Override
    public void quickSort(CustomArray array) {
        int[] tempArray = array.getArray();
        int low = 0;
        int high = array.getArray().length -1;
        quickSort(tempArray, low, high);
        array.setArray(tempArray);
        log.log(Level.INFO, "CustomArray has been sorted: {}", array.toString());
    }

    private void quickSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex)
            return;

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);

        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);

        quickSort(array, lowIndex, rightPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    @Override
    public void streamSort(CustomArray array) {
        int[] tempArray = array.getArray();
        int[] sortedArray;
        sortedArray = IntStream.of(tempArray)
                .sorted()
                .toArray();
        array.setArray(sortedArray);
        log.log(Level.INFO, "CustomArray has been sorted: {}", array.toString());
    }
}
