package com.company.homework;

import com.company.homework.collections.comparable.CompareExample;
import com.company.homework.collections.lists.ListsExample;
import com.company.homework.collections.map.MapExample;
import com.company.homework.collections.set.SetExample;
import com.company.homework.lambdas.LambdaExample;
import com.company.homework.multithreading.collections.MultithreadingCollectionsExample;
import com.company.homework.multithreading.comparable.ComparableExample;
import com.company.homework.multithreading.synchronizing.SynchronizedExample;
import com.company.homework.multithreading.threadpools.ThreadPoolDemo;
import com.company.homework.multithreading.producerconsumer.ProducerConsumerExample;

import java.util.ArrayList;
import java.util.List;

public class HomeworkDemo {

    public static void main(String[] args) {
        List<Lesson> examples = new ArrayList<>();
        examples.add(new ListsExample());
        examples.add(new SetExample());
        examples.add(new CompareExample());
        examples.add(new MapExample());
        examples.add(new ComparableExample());
        examples.add(new SynchronizedExample());
        examples.add(new MultithreadingCollectionsExample());
        examples.add(new ProducerConsumerExample());
        examples.add(new ThreadPoolDemo());
        examples.add(new LambdaExample());

        examples.forEach(Lesson::print);
    }
}
