package com.company.homework.multithreading.threadpools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageProcessor implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageProcessor.class);
    private int message;

    public MessageProcessor(int message) {
        this.message = message;
    }

    @Override
    public void run() {
        LOGGER.info("Thread {} received a message", Thread.currentThread().getName());
        respondMessage();
        LOGGER.info("Processing message {} , message {}", Thread.currentThread().getName(), message);

    }

    private void respondMessage(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
