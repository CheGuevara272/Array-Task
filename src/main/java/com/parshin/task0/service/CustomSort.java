package com.parshin.task0.service;

import com.parshin.task0.entity.CustomArray;

public interface CustomSort {
    void bubbleSort(CustomArray array);
    void selectionSort (CustomArray array);
    void quickSort(CustomArray array, int low, int high);
}
