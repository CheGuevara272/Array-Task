package com.parshin.task0.entity;

import com.parshin.task0.util.CustomArrayCounter;

import java.util.Arrays;

public class CustomArray {
    private int[] numbers;
    private int arrayId;

    public CustomArray() {
    }

    public CustomArray(int[] numbers) {
        this.numbers = new int[numbers.length];
        System.arraycopy(numbers, 0, this.numbers, 0, numbers.length);
        this.arrayId = CustomArrayCounter.getArrayCount();
    }

    public int[] getNumbers() {
        int[] copy = new int[this.numbers.length];
        System.arraycopy(this.numbers, 0, copy, 0, copy.length);
        return copy;
    }

    public void setNumbers(int[] scr) {
        this.numbers = new int[scr.length];
        System.arraycopy(scr, 0, this.numbers, 0, scr.length);
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
        return Arrays.equals(numbers, that.numbers);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(numbers);
        result = 31 * result + arrayId;
        return result;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "numbers=" + Arrays.toString(numbers) +
                ", arrayId=" + arrayId +
                '}';
    }
}
