package com.parshin.task0.main;

import com.parshin.task0.entity.CustomArray;
import com.parshin.task0.exception.CustomException;
import com.parshin.task0.parser.CustomParser;
import com.parshin.task0.parser.impl.CustomParserImpl;
import com.parshin.task0.reader.CustomReader;
import com.parshin.task0.reader.impl.CustomReaderImpl;
import com.parshin.task0.service.CustomMath;
import com.parshin.task0.service.impl.CustomMathImpl;
import com.parshin.task0.service.impl.CustomSortImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class Main {
    private static final Logger log = LogManager.getLogger();
    public static void main(String[] args) {
        final String fileName = "data/numbers.txt";
        CustomReader reader = new CustomReaderImpl();
        List<String> strList = null;
        try {
            strList = reader.readFile(fileName);
            log.log(Level.INFO, "Lines were read");
        } catch (CustomException e) {
            log.log(Level.INFO, "File wasn't read");
        }


        CustomParser parser = new CustomParserImpl();
        CustomArray numbers = new CustomArray(parser.convertStringToInts(strList.get(0)));
        log.log(Level.INFO, numbers.toString());


        CustomMath  math = new CustomMathImpl();
        int max = math.findMax(numbers);
        int min = math.findMin(numbers);
        double average = math.findAverage(numbers);
        int sum = math.findSum(numbers);
        int negativeSum = math.sumNegative(numbers);
        int positiveSum = math.sumPositive(numbers);
        int numberOfNegatives = math.countNegative(numbers);
        int numberOfPositives = math.countPositive(numbers);

        CustomArray numbers1 = new CustomArray(parser.convertStringToInts(strList.get(1)));
        log.log(Level.INFO, numbers1.toString());

        CustomSortImpl sort = new CustomSortImpl();
        sort.quickSort(numbers1);
        log.log(Level.INFO, numbers1.toString());

        CustomArray numbers2 = new CustomArray(parser.convertStringToInts(strList.get(2)));
        log.log(Level.INFO, numbers2.toString());

        sort.bubbleSort(numbers2);
        log.log(Level.INFO, numbers2.toString());

        CustomArray numbers3 = new CustomArray(parser.convertStringToInts(strList.get(3)));
        log.log(Level.INFO, numbers3.toString());

        sort.selectionSort(numbers3);
        log.log(Level.INFO, numbers3.toString());
    }
}
