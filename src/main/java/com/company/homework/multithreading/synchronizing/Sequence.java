package com.company.homework.multithreading.synchronizing;

public class Sequence {

    private int value = 0;

    public int getNext() {
        synchronized (this) {
            value++;
            return value;
        }
    }
}
