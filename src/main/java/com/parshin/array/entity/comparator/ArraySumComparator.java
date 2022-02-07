package com.parshin.array.entity.comparator;

import com.parshin.array.entity.CustomArray;
import com.parshin.array.service.impl.CustomMathImpl;

import java.util.Comparator;

public class ArraySumComparator  implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        CustomMathImpl math = CustomMathImpl.getInstance();

        return math.findSum(o1) - math.findSum(o2);
    }
}
