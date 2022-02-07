package com.parshin.array.repository.impl;

import com.parshin.array.entity.CustomArray;
import com.parshin.array.repository.Specification;

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
