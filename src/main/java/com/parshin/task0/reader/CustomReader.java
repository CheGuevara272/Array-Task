package com.parshin.task0.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CustomReader {
    BufferedReader reader;
    public int[] readFile(String arrData){
        try {
            reader = new BufferedReader(new FileReader(arrData));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String str = null;

        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert str != null;
        String[] numbersStr = str.split("\\s+");
        int[] integers = new int[numbersStr.length];

        for (int i = 0; i < numbersStr.length; i++) {
            integers[i] = Integer.parseInt(numbersStr[i]);
        }

        return integers;
    }
}
