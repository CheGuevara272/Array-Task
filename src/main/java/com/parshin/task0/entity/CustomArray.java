package com.parshin.task0.entity;

import com.parshin.task0.observer.ArrayEvent;
import com.parshin.task0.observer.ArrayObserver;
import com.parshin.task0.observer.Observable;
import com.parshin.task0.util.CustomArrayCounter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArray implements Observable {
    private static final Logger log = LogManager.getLogger();
    private int arrayId;
    private int[] array;
    private List<ArrayObserver> observersList = new ArrayList<>();

    {
        this.arrayId = CustomArrayCounter.getArrayCount();
    }

    public CustomArray() {
    }

    public CustomArray(int[] numbers) {
        this.array = new int[numbers.length];
        System.arraycopy(numbers, 0, this.array, 0, numbers.length);

    }

    public void setElement(int index, int value) {
        if (index > 0 && index < array.length) {
            array[index] = value;
            notifyObservers();
        }
        else {
            log.log(Level.ERROR, "Index is out of array bounds");
        }
    }

    public int[] getArray() {
        int[] copy = new int[this.array.length];
        System.arraycopy(this.array, 0, copy, 0, copy.length);
        return copy;
    }

    public void setArray(int[] scr) {
        this.array = new int[scr.length];
        System.arraycopy(scr, 0, this.array, 0, scr.length);
        notifyObservers();
    }

    public int getArrayId() {
        return arrayId;
    }

    public void setArrayId(int arrayId) {
        this.arrayId = arrayId;
    }

    @Override
    public void attach(ArrayObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void detach(ArrayObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        ArrayEvent event = new ArrayEvent(this);

        for (ArrayObserver observer: observersList) {
            observer.arrayChanged(event);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArray that = (CustomArray) o;

        if (arrayId != that.arrayId) return false;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(array);
        result = 31 * result + arrayId;
        return result;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "numbers=" + Arrays.toString(array) +
                ", arrayId=" + arrayId +
                '}';
    }
}
