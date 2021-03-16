package com.company.homework.multithreading.comparable;

import com.company.homework.Lesson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComparableExample implements Lesson {

    private static final Logger LOGGER = LoggerFactory.getLogger(ComparableExample.class);

    @Override
    public void print() {
        Thread t1 = new Thread (() -> {
            Thread.currentThread().setName("first thread");

            for (int i = 0; i < 10; i++) {
                LOGGER.info("number {} thread - {}", i, Thread.currentThread().getName());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();

        Thread t2 = new Thread (() -> {
            Thread.currentThread().setName("second thread");

            for (int i = 0; i < 10; i++) {
                LOGGER.info("number {} thread - {}", i, Thread.currentThread().getName());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();
    }
}
