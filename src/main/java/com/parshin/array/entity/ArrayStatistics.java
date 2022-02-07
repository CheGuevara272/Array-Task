package com.parshin.array.entity;

public class ArrayStatistics {
    private int max;
    private int min;
    private int sum;
    private double average;

    public ArrayStatistics(int max, int min, int sum, double average) {
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.average = average;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
