package com.company.homework.multithreading.producerconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Producer implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);
    private List<Integer> questionList;
    private final int LIMIT = 5;
    private int questionNo;

    public Producer(List<Integer> questionList) {
        this.questionList = questionList;
    }

    public void readQuestion(int questionNo) {
        synchronized (questionList) {
            while (questionList.size() == LIMIT) {
                LOGGER.info(".... wait for answers");
                try {
                    questionList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        synchronized (questionList) {
            LOGGER.info("question: {}", questionNo);
            questionList.add(questionNo);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            questionList.notify();
        }
    }

    @Override
    public void run() {
        while (questionList.size() != 4) {
            readQuestion(questionNo++);
        }
    }
}
