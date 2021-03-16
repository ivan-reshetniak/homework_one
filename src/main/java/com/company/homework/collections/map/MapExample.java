package com.company.homework.collections.map;

import com.company.homework.Lesson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class MapExample implements Lesson {

    private static final Logger LOGGER = LoggerFactory.getLogger(MapExample.class);

    @Override
    public void print() {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("brave", "ready to face danger");
        dictionary.put("brilliant", "exceptionally clever");
        dictionary.put("joy", "a feeling of pleasure");
        LOGGER.info("{}", dictionary.keySet());

        dictionary.forEach((key, value) -> LOGGER.info("{}", key));
    }
}
