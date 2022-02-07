package com.parshin.array.service;

import com.parshin.array.entity.CustomArray;

public interface CustomSort {
    void bubbleSort(CustomArray array);
    void selectionSort (CustomArray array);
    void quickSort(CustomArray array);
    void streamSort(CustomArray array);
}
