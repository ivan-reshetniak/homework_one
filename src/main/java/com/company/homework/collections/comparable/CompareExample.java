package com.company.homework.collections.comparable;

import com.company.homework.Lesson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompareExample implements Lesson {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompareExample.class);

    @Override
    public void print() {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("Mike", 3500, "accounting"));
        employees.add(new Employee("Mark", 3700, "admin"));
        employees.add(new Employee("Peter", 3000, "hr"));

        List<Employee> employeeArrayList = new ArrayList<>(employees);
        Collections.sort(employeeArrayList);
        LOGGER.info("{}", employeeArrayList);
    }
}
