package com.company.homework.multithreading.synchronizing;

import com.company.homework.Lesson;

public class SynchronizedExample implements Lesson {

    @Override
    public void print() {
        Sequence sequence = new Sequence();
        Worker worker1 = new Worker(sequence);
        worker1.start();
        Worker worker2 = new Worker(sequence);
        worker2.start();
    }
}
