package com.parshin.array.repository.impl;

import com.parshin.array.entity.CustomArray;
import com.parshin.array.repository.Specification;

public class IdEqualsSpecification implements Specification {
    // Id == | > | < | >< | max | min
    private int id;

    public IdEqualsSpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArray array) {
        return array.getArrayId() == id;
    }
}
