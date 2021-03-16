package com.company.homework.multithreading.producerconsumer;

import com.company.homework.Lesson;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerExample implements Lesson {

    @Override
    public void print() {
        List<Integer> questionList = new ArrayList<>();
        Thread thread1 = new Thread(new Producer(questionList));
        Thread thread2 = new Thread(new Consumer(questionList));

        thread1.start();
        thread2.start();
    }
}
