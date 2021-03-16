package com.company.homework.multithreading.collections;

import com.company.homework.Lesson;

public class MultithreadingCollectionsExample implements Lesson {

    @Override
    public void print() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        InventoryManager inventoryManager = new InventoryManager();
        Thread inventoryTask = new Thread(() -> {
            inventoryManager.populateSoldProducts();
        });

        Thread displayTask = new Thread(() -> {
            inventoryManager.displayProducts();
        });

        inventoryTask.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        displayTask.start();
    }
}
