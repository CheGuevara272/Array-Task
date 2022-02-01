package com.parshin.task0.observer.impl;

import com.parshin.task0.entity.ArrayStatistics;
import com.parshin.task0.entity.Warehouse;
import com.parshin.task0.observer.ArrayEvent;
import com.parshin.task0.observer.ArrayObserver;
import com.parshin.task0.service.impl.CustomMathImpl;

public class ArrayObserverImpl implements ArrayObserver {
    @Override
    public void arrayChanged(ArrayEvent event) {
        CustomMathImpl math = new CustomMathImpl();
        int max = math.findMax(event.getSource());
        int min = math.findMin(event.getSource());
        int sum = math.findSum(event.getSource());
        double avg = math.findAverage(event.getSource());
        ArrayStatistics statistics = new ArrayStatistics(max, min, sum, avg);

        int arrayId = event.getSource().getArrayId();
        Warehouse warehouse = Warehouse.getWarehouse();
        warehouse.replace(arrayId, statistics);
    }
}
