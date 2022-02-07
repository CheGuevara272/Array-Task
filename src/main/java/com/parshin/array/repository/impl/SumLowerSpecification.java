package com.parshin.array.repository.impl;

import com.parshin.array.entity.CustomArray;
import com.parshin.array.repository.Specification;
import com.parshin.array.service.impl.CustomMathImpl;

public class SumLowerSpecification implements Specification {
    private int sum;

    public SumLowerSpecification(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean specify(CustomArray array) {
        CustomMathImpl math = CustomMathImpl.getInstance();
        int arraySum = math.findSum(array);

        return arraySum < this.sum;
    }
}
