package com.company.homework.multithreading.collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(InventoryManager.class);
    private List<Product> soldProducts = new CopyOnWriteArrayList<>();
    private List<Product> purchasedProducts = new ArrayList<>();

    public void populateSoldProducts() {
        for (int i = 0; i < 10; i++) {
            soldProducts.add(new Product(i, "product - " + i));
            LOGGER.info("product added id = {}", i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void displayProducts() {
        soldProducts.forEach(product -> {
            LOGGER.info("printing the sold {}", product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
