package com.company.homework.multithreading.synchronizing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Worker extends Thread {

    private static final Logger LOGGER = LoggerFactory.getLogger(Worker.class);
    private Sequence sequence;

    public Worker(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            LOGGER.info("{} value of sequence {}", Thread.currentThread().getName(), sequence.getNext());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
