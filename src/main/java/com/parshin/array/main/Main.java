package com.parshin.array.main;

import com.parshin.array.exception.CustomException;
import com.parshin.array.factory.impl.CustomArrayFactoryImpl;
import com.parshin.array.parser.impl.CustomParserImpl;
import com.parshin.array.reader.impl.CustomReaderImpl;
import com.parshin.array.repository.CustomRepository;
import com.parshin.array.service.impl.CustomSortImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger log = LogManager.getLogger();
    public static void main(String[] args) {
        final String fileName = "data/numbers.txt";

        CustomReaderImpl customReader = CustomReaderImpl.getInstance();
        List<String> strList = new ArrayList<>();
        try {
            strList = customReader.readFile(fileName);
            log.log(Level.INFO, "Lines were read");
        } catch (CustomException e) {
            log.log(Level.ERROR, "File wasn't read");
        }
        CustomArrayFactoryImpl customArrayFactory = CustomArrayFactoryImpl.getInstance();
        CustomParserImpl customParser = CustomParserImpl.getInstance();

        for (String line : strList) {
            int[] array = customParser.convertStringToInts(line);
            customArrayFactory.createCustomArray(array);
        }

        CustomSortImpl customSort = CustomSortImpl.getInstance();
        CustomRepository repository = CustomRepository.getInstance();
        customSort.quickSort(repository.getArray(0));
    }
}
