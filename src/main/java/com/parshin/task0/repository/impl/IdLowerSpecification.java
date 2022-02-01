package com.parshin.task0.repository.impl;

import com.parshin.task0.entity.CustomArray;
import com.parshin.task0.repository.Specification;

public class IdLowerSpecification implements Specification {
    private int id;

    public IdLowerSpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArray array) {
        return array.getArrayId() < id;
    }
}
