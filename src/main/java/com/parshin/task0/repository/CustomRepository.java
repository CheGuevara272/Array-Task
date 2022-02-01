package com.parshin.task0.repository;

import com.parshin.task0.entity.CustomArray;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomRepository {
    private List<CustomArray> listOfArrays;

    public void add(int index, CustomArray element) {
        listOfArrays.add(index, element);
    }

    public CustomArray remove(int index) {
        return listOfArrays.remove(index);
    }
    // <? super ...>
    public List sort(Comparator<CustomArray> c) {
        List<CustomArray> list = new ArrayList<>();
        list.addAll(listOfArrays);
        list.sort(c);
        return list;
    }

    public void addArray(CustomArray array) {
        listOfArrays.add(array);
    }
    public void removeArray(CustomArray array) {
        listOfArrays.remove(array);
    }
    public CustomArray getArray(int index) {
        return listOfArrays.get(index);
    }
    public CustomArray setArray(int index, CustomArray array) {
        return listOfArrays.set(index, array);
    }

    public List<CustomArray> query(Specification specification) {
        List<CustomArray> list = new ArrayList<>();
        for (CustomArray array : listOfArrays) {
            if (specification.specify(array)) {
                list.add(array);
            }
        }
        return list;
    }

//    public List<CustomArray> queryStream(Specification specification) {
//        List<CustomArray> list = new ArrayList<>();
//
//        return list;
//    }

}
