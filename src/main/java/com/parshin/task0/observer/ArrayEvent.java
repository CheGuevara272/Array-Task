package com.parshin.task0.observer;

import com.parshin.task0.entity.CustomArray;

import java.util.EventObject;

public class ArrayEvent extends EventObject {
    public ArrayEvent(CustomArray source) {
        super(source);
    }

    @Override
    public CustomArray getSource() {
        return (CustomArray)super.getSource();
    }
}
