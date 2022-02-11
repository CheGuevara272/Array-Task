package com.parshin.array.factory.impl;

import com.parshin.array.entity.ArrayStatistics;
import com.parshin.array.entity.CustomArray;
import com.parshin.array.entity.Warehouse;
import com.parshin.array.exception.CustomException;
import com.parshin.array.factory.CustomArrayFactory;
import com.parshin.array.observer.impl.ArrayObserverImpl;
import com.parshin.array.repository.CustomRepository;
import com.parshin.array.service.impl.CustomMathImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayFactoryImpl implements CustomArrayFactory {
    private static final Logger log = LogManager.getLogger();
    private static final CustomArrayFactoryImpl instance = new CustomArrayFactoryImpl();

    private CustomArrayFactoryImpl(){
    }

    public static CustomArrayFactoryImpl getInstance() {
        return instance;
    }

    @Override
    public void configureCustomArray(int[] intArray) {
        CustomArray customArray = new CustomArray(intArray);
        log.log(Level.INFO, "New CustomArray  has been created {}", customArray.toString());
        addToRepository(customArray);
        addToWarehouse(customArray);
        addObserver(customArray);
    }

    private void addObserver(CustomArray customArray) {
        ArrayObserverImpl observer = new ArrayObserverImpl();
        customArray.attach(observer);
        log.log(Level.INFO, "Observer has been added to new CustomArray");
    }

    private void addToWarehouse(CustomArray customArray) {
        CustomMathImpl customMath = CustomMathImpl.getInstance();
        int max = customMath.findMax(customArray);
        int min = customMath.findMin(customArray);
        int sum = customMath.findSum(customArray);
        double average = customMath.findAverage(customArray);
        ArrayStatistics arrayStatistics = new ArrayStatistics(min, max, sum, average);
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.put(customArray.getArrayId(), arrayStatistics);
        log.log(Level.INFO, "ArrayStatistics has been added to warehouse");
    }

    private void addToRepository(CustomArray customArray) {
        CustomRepository repository = CustomRepository.getInstance();
        repository.addArray(customArray);
        log.log(Level.INFO, "CustomArray has been added to repository");
    }
}
