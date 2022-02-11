package com.parshin.array.observer;

import com.parshin.array.entity.CustomArray;
import com.parshin.array.entity.AbstractCustomArray;

import java.util.EventObject;

public class ArrayEvent extends EventObject {
    public ArrayEvent(AbstractCustomArray source) {
        super(source);
    }

    @Override
    public CustomArray getSource() {
        return (CustomArray)super.getSource();
    }
}
