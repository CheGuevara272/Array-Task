package com.parshin.task0.repository.impl;

import com.parshin.task0.entity.CustomArray;
import com.parshin.task0.repository.Specification;

public class IdInRangeSpecification implements Specification {
    private int minId, maxId;

    public IdInRangeSpecification(int minId, int maxId) {
        this.minId = minId;
        this.maxId = maxId;
    }

    @Override
    public boolean specify(CustomArray array) {
        return array.getArrayId() >= minId && array.getArrayId() <= maxId;
    }
}
