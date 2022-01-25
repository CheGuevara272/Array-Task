package com.parshin.task0.main;

import com.parshin.task0.entity.CustomArray;
import com.parshin.task0.exception.CustomException;
import com.parshin.task0.parser.CustomParser;
import com.parshin.task0.parser.impl.CustomParserImpl;
import com.parshin.task0.reader.CustomReader;
import com.parshin.task0.reader.impl.CustomReaderImpl;
import com.parshin.task0.service.CustomMath;
import com.parshin.task0.service.impl.CustomMathImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    private static final Logger log = LogManager.getLogger();
    public static void main(String[] args) {
        final String fileName = "data/numbers.txt";
        CustomReader reader = new CustomReaderImpl();
        CustomParser parser = new CustomParserImpl();
        CustomMath  math = new CustomMathImpl();
        String str = null;
        try {
            str = reader.readFile(fileName);
            log.log(Level.INFO, "Read line from the file is " + str);
        } catch (CustomException e) {
            log.log(Level.INFO, "File wasn't read");
        }
        CustomArray numbers = new CustomArray(parser.convertStringToInts(str));

        int max = math.findMax(numbers);
        log.log(Level.INFO, "Max number in the array " + numbers.toString() + " = " + max);
        int min = math.findMin(numbers);
        log.log(Level.INFO, "Min number in the array " + numbers.toString() + " = " + min);
        double average = math.findAverage(numbers);
        log.log(Level.INFO, "Average value in the array " + numbers.toString() + " = " + average);
        int sum = math.findSum(numbers);
        log.log(Level.INFO, "Sum of numbers in the array " + numbers.toString() + " = " + sum);
        int negativeSum = math.sumNegative(numbers);
        log.log(Level.INFO, "Sun of negatives in the array " + numbers.toString() + " = " + negativeSum);
        int positiveSum = math.sumPositive(numbers);
        log.log(Level.INFO, "Sum of positives in the array " + numbers.toString() + " = " + positiveSum);
        int numberOfNegatives = math.countNegative(numbers);
        log.log(Level.INFO, "Number of negatives in the array " + numbers.toString() + " = " + numberOfNegatives);
        int numberOfPositives = math.countPositive(numbers);
        log.log(Level.INFO, "Number of positives in the array " + numbers.toString() + " = " + numberOfPositives);
    }
}
