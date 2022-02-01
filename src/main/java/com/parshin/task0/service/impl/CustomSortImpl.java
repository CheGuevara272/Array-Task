package com.parshin.task0.service.impl;

import com.parshin.task0.entity.CustomArray;
import com.parshin.task0.service.CustomSort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class CustomSortImpl implements CustomSort {
    private static final Logger log = LogManager.getLogger();
    @Override
    public void bubbleSort(CustomArray array) {
        int[] tempArray = array.getArray();

        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 1; j < (tempArray.length - i); j++) {
                if (tempArray[j - 1] > tempArray[j]) {
                    int temp = tempArray[j - 1];
                    tempArray[j - 1] = tempArray[j];
                    tempArray[j] = temp;
                }
            }
        }
        array.setArray(tempArray);
    }

    @Override
    public void selectionSort (CustomArray array){
        int min, temp;
        int[] tempArray = array.getArray();
        for (int index = 0; index < tempArray.length-1; index++){
            min = index;
            for (int scan = index+1; scan < tempArray.length; scan++) {
                if (tempArray[scan] < tempArray[min])
                    min = scan;
            }
            temp = tempArray[min];
            tempArray[min] = tempArray[index];
            tempArray[index] = temp;
        }
        array.setArray(tempArray);
    }

    @Override
    public void quickSort(CustomArray array) {
        int[] tempArray = array.getArray();
        int low = 0;
        int high = array.getArray().length -1;
        quickSort(tempArray, low, high);
        array.setArray(tempArray);
    }

    private void quickSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex)
            return;

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];


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

    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
