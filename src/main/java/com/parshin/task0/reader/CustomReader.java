package com.parshin.task0.reader;

import com.parshin.task0.exception.CustomException;

public interface CustomReader {
    String readFile(String fileName) throws CustomException;
}
