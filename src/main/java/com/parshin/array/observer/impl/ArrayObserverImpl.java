package com.parshin.array.observer.impl;

import com.parshin.array.entity.ArrayStatistics;
import com.parshin.array.entity.CustomArray;
import com.parshin.array.entity.Warehouse;
import com.parshin.array.observer.ArrayEvent;
import com.parshin.array.observer.ArrayObserver;
import com.parshin.array.service.impl.CustomMathImpl;

public class ArrayObserverImpl implements ArrayObserver {
    @Override
    public void arrayChanged(ArrayEvent event) {
        CustomMathImpl math = CustomMathImpl.getInstance();
        CustomArray array = event.getSource();
        int max = math.findMax(array);
        int min = math.findMin(array);
        int sum = math.findSum(array);
        double avg = math.findAverage(array);
        ArrayStatistics statistics = new ArrayStatistics(max, min, sum, avg);

        int arrayId = array.getArrayId();
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.replace(arrayId, statistics);
    }
}
