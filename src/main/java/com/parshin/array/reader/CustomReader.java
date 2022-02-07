package com.parshin.array.reader;

import com.parshin.array.exception.CustomException;

import java.util.List;

public interface CustomReader {
    List<String> readFile(String fileName) throws CustomException;
}
