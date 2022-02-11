package com.parshin.array.entity;

import com.parshin.array.observer.ArrayEvent;
import com.parshin.array.observer.ArrayObservable;
import com.parshin.array.observer.ArrayObserver;
import com.parshin.array.util.CustomArrayIdGenerator;

import java.util.ArrayList;
import java.util.List;

public class AbstractCustomArray implements ArrayObservable {
    protected int arrayId;
    private List<ArrayObserver> observersList = new ArrayList<>();

    {
        this.arrayId = CustomArrayIdGenerator.generateId();
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
        if (!observersList.isEmpty()) {
            for (ArrayObserver observer : observersList) {
                observer.arrayChanged(new ArrayEvent(this));
            }
        }
    }

}
