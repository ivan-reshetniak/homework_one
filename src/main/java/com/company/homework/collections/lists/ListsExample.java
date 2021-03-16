package com.company.homework.collections.lists;

import com.company.homework.Lesson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsExample implements Lesson {

    private static final Logger LOGGER = LoggerFactory.getLogger(ListsExample.class);

    @Override
    public void print() {
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("there");
        words.add("10");
        printList(words);

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(45);
        numbers.add(1000);
        numbers.removeFirst();
        printList(numbers);

        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle firstVehicle = new Vehicle("toyota", "camry", 1100, false);
        vehicles.add(new Vehicle("honda", "accord", 1000, false));
        vehicles.add(firstVehicle);

        for (Vehicle vehicle : vehicles) {
            LOGGER.info(vehicle.toString());
        }
    }

    public static void printList(List<?> list) {
        LOGGER.info("{}", list);
    }
}
