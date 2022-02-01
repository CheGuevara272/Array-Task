package com.parshin.task0.entity.comparator;

import com.parshin.task0.entity.ArrayStatistics;
import com.parshin.task0.entity.CustomArray;
import com.parshin.task0.entity.Warehouse;

import java.util.Comparator;

public class ArraySumComparator  implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        Warehouse warehouse = Warehouse.getWarehouse();
        ArrayStatistics statistics1 = warehouse.get(o1.getArrayId());
        ArrayStatistics statistics2 = warehouse.get(o2.getArrayId());

        return statistics1.getSum() - statistics2.getSum();
    }
}
