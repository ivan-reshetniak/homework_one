package com.company.homework.collections.set;

import com.company.homework.Lesson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample implements Lesson {

    private static final Logger LOGGER = LoggerFactory.getLogger(SetExample.class);

    @Override
    public void print() {
        Set<String> strings = new HashSet<>();
        strings.add("Random");
        strings.add("Animal");
        strings.add("People");
        strings.add("Random");
        strings.add("Random");
        LOGGER.info("{}", strings);

        Set<String> exampleStrings = new LinkedHashSet<>();
        exampleStrings.add("Random");
        exampleStrings.add("Zoo");
        exampleStrings.add("People");
        exampleStrings.add("Car");
        LOGGER.info("{}", exampleStrings);

        Set<Animal> animals = new HashSet<>();
        animals.add(new Animal("Dog", 12));
        animals.add(new Animal("Cat", 8));
        animals.add(new Animal("Bird", 3));
        animals.add(new Animal("Dog", 12));
        LOGGER.info("{}", animals);
    }
}
