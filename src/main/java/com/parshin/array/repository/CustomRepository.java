package com.parshin.array.repository;

import com.parshin.array.entity.CustomArray;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomRepository {
    private static final CustomRepository instance = new CustomRepository();
    private List<CustomArray> listOfArrays = new ArrayList<>();

    private CustomRepository(){
    }

    public static CustomRepository getInstance(){
        return instance;
    }

    public List sort(Comparator<CustomArray> c) {
        List<CustomArray> list = new ArrayList<>();
        list.addAll(listOfArrays);
        list.sort(c);
        return list;
    }

    public void addArray(CustomArray array) {
        listOfArrays.add(array);
    }

    public CustomArray getArray(int index) {
        return listOfArrays.get(index);
    }

    public void removeArray(CustomArray array) {
        listOfArrays.remove(array);
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

    public List<CustomArray> queryStream(Specification specification) {
        List<CustomArray> list = new ArrayList<>(listOfArrays);
        list.stream().filter(specification::specify)
                .toList();
        return list;
    }
}
