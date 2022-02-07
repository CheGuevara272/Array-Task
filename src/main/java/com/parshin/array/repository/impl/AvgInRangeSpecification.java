package com.parshin.array.repository.impl;

import com.parshin.array.entity.CustomArray;
import com.parshin.array.repository.Specification;
import com.parshin.array.service.impl.CustomMathImpl;

public class AvgInRangeSpecification implements Specification {
    double lowAvg;
    double highAvg;

    public AvgInRangeSpecification(double lowAvg, double highAvg) {
        this.lowAvg = lowAvg;
        this.highAvg = highAvg;
    }

    @Override
    public boolean specify(CustomArray array) {
        CustomMathImpl math = CustomMathImpl.getInstance();
        double arrayAvg = math.findAverage(array);

        return arrayAvg >= lowAvg && arrayAvg <= highAvg;
    }
}
