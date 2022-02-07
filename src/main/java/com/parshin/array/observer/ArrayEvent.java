package com.parshin.array.observer;

import com.parshin.array.entity.CustomArray;
import com.parshin.array.entity.CustomArrayAbstract;

import java.util.EventObject;

public class ArrayEvent extends EventObject {
    public ArrayEvent(CustomArrayAbstract source) {
        super(source);
    }

    @Override
    public CustomArray getSource() {
        return (CustomArray)super.getSource();
    }
}
