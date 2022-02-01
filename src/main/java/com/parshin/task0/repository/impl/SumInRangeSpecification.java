package com.parshin.task0.repository.impl;

import com.parshin.task0.entity.ArrayStatistics;
import com.parshin.task0.entity.CustomArray;
import com.parshin.task0.entity.Warehouse;
import com.parshin.task0.repository.Specification;

public class SumInRangeSpecification implements Specification {
    private int lowSum;
    private int highSum;

    public SumInRangeSpecification(int lowSum, int highSum) {
        this.lowSum = lowSum;
        this.highSum = highSum;
    }

    @Override
    public boolean specify(CustomArray array) {
        Warehouse warehouse = Warehouse.getWarehouse();
        ArrayStatistics statistics = warehouse.get(array.getArrayId());

        return statistics.getSum() >= lowSum && statistics.getSum() <= highSum;
    }
}
