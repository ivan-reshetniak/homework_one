package com.company.homework.multithreading.producerconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Consumer implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);
    private List<Integer> questionList;

    public Consumer(List<Integer> questionList) {
        this.questionList = questionList;
    }

    public void answerQuestion() {
        synchronized (questionList) {
            while (questionList.isEmpty()) {
                LOGGER.info("no questions to answer");
                try {
                    questionList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        synchronized (questionList) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LOGGER.info("answered question: {}", questionList.remove(0));
            questionList.notify();
        }
    }

    @Override
    public void run() {
        while (questionList.size() != 4) {
            answerQuestion();
        }
    }
}
