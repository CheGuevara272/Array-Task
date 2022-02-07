package com.parshin.array.repository.impl;

import com.parshin.array.entity.CustomArray;
import com.parshin.array.repository.Specification;
import com.parshin.array.service.impl.CustomMathImpl;

public class AvgHigherSpecification implements Specification {
    double avg;

    public AvgHigherSpecification(double avg) {
        this.avg = avg;
    }

    @Override
    public boolean specify(CustomArray array) {
        CustomMathImpl math = CustomMathImpl.getInstance();
        double arrayAvg = math.findAverage(array);

        return arrayAvg > avg;
    }
}