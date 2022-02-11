package com.parshin.array.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;
import java.util.StringJoiner;

public class CustomArray extends CustomArrayAbstract {
    private static final Logger log = LogManager.getLogger();
    private int[] array;

    private CustomArray() {
    }

    public CustomArray(int[] array) { //TODO Надо ли делать валидацию массива, если в парсере и ридере уже есть валидоторы?
        this.array = new int[array.length];
        System.arraycopy(array, 0, this.array, 0, array.length);
    }

    public boolean setElement(int index, int value) {
        if (index > 0 && index < array.length) {
            array[index] = value;
            notifyObservers();
            return true;
        }
        else {
            log.log(Level.ERROR, "Index is out of array bounds");
            return false;
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
        return new StringJoiner(", ", CustomArray.class.getSimpleName() + "[", "]")
                .add("array=" + Arrays.toString(array))
                .toString();
    }
}
