package com.parshin.task0.repository.impl;

import com.parshin.task0.entity.ArrayStatistics;
import com.parshin.task0.entity.CustomArray;
import com.parshin.task0.entity.Warehouse;
import com.parshin.task0.repository.Specification;

public class SumLowerSpecification implements Specification {
    private int sum;

    public SumLowerSpecification(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean specify(CustomArray array) {
        Warehouse warehouse = Warehouse.getWarehouse();
        ArrayStatistics statistics = warehouse.get(array.getArrayId());

        return statistics.getSum() < sum;
    }
}
