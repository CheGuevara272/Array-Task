package com.parshin.task0.reader;

import com.parshin.task0.exception.CustomException;

import java.util.List;

public interface CustomReader {
    List<String> readFile(String fileName) throws CustomException;
}
