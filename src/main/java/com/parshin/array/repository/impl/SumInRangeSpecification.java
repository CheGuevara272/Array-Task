package com.parshin.array.repository.impl;

import com.parshin.array.entity.CustomArray;
import com.parshin.array.repository.Specification;
import com.parshin.array.service.impl.CustomMathImpl;

public class SumInRangeSpecification implements Specification {
    private int lowSum;
    private int highSum;

    public SumInRangeSpecification(int lowSum, int highSum) {
        this.lowSum = lowSum;
        this.highSum = highSum;
    }

    @Override
    public boolean specify(CustomArray array) {
        CustomMathImpl math = CustomMathImpl.getInstance();
        int arraySum = math.findSum(array);

        return arraySum >= lowSum && arraySum <= highSum;
    }
}
