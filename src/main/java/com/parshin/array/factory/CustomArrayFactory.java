package com.parshin.array.factory;

import com.parshin.array.exception.CustomException;

public interface CustomArrayFactory {
    void configureCustomArray(int[] intArray) throws CustomException;
}
