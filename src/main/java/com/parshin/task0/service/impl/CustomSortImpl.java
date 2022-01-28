package com.parshin.task0.service.impl;

import com.parshin.task0.entity.CustomArray;
import com.parshin.task0.service.CustomSort;

public class CustomSortImpl implements CustomSort {
    @Override
    public void bubbleSort(CustomArray array) {
        int[] tempArray = array.getNumbers();

        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 1; j < (tempArray.length - i); j++) {
                if (tempArray[j - 1] > tempArray[j]) {
                    int temp = tempArray[j - 1];
                    tempArray[j - 1] = tempArray[j];
                    tempArray[j] = temp;
                }
            }
        }
        array.setNumbers(tempArray);
    }

    @Override
    public void selectionSort (CustomArray array){
        int min, temp;
        int[] tempArray = array.getNumbers();
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
        array.setNumbers(tempArray);
    }

    @Override
    public void quickSort(CustomArray array, int low, int high) {
        int[] tempArray = array.getNumbers();
        quickSort(tempArray, low, high);
        array.setNumbers(tempArray);
    }

    private void quickSort(int[] array, int low, int high) {
        if (array.length == 0 || low >= high)
            return;

        int middle = low + (high - low) / 2;
        int partition = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < partition) {
                i++;
            }

            while (array[j] > partition) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(array, low, j);
        quickSort(array, i, high);
    }
}
