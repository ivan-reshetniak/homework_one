package com.company.homework.multithreading.threadpools;

import com.company.homework.Lesson;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo implements Lesson {

    @Override
    public void print() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable processor1 = new MessageProcessor(2);
        executorService.execute(processor1);

        Runnable processor2 = new MessageProcessor(3);
        executorService.execute(processor2);

        Runnable processor3 = new MessageProcessor(4);
        executorService.execute(processor3);

        executorService.shutdown();
    }
}
