package com.parshin.task0.array;

public class Array {
    static int counter = 0;
    private int[] numbers;
    private int arrayID;

    public Array() {
    }

    public Array(int[] numbers) {
        this.numbers = numbers;
        counter++;
        this.arrayID = counter;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getArrayID() {
        return arrayID;
    }

    public void setArrayID(int arrayID) {
        this.arrayID = arrayID;
    }
}
