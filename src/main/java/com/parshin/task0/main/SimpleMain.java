package com.parshin.task0.main;

import com.parshin.task0.array.Array;
import com.parshin.task0.reader.CustomReader;
import com.parshin.task0.service.CustomSearch;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class SimpleMain {
    private static final Logger log = LogManager.getLogger();
    public static void main(String[] args) {
        log.log(Level.INFO, "First log");
        final String arrData = "src/main/resources/data/numbers.txt";

        CustomReader reader = new CustomReader();
        CustomSearch search = new CustomSearch();
        Array numbers = new Array(reader.readFile(arrData));

        int maxNum = search.maxNum(numbers.getNumbers());
        log.log(Level.INFO, "maxNum = {} ;", maxNum);
    }
}
