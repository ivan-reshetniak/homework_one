package com.company.homework.lambdas;

import com.company.homework.Lesson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample implements Lesson {

    private static final Logger LOGGER = LoggerFactory.getLogger(LambdaExample.class);

    @Override
    public void print() {
        List<Car> cars = Arrays.asList(
                new Car("toyota", "camry", 1500),
                new Car("honda", "civic", 1100),
                new Car("toyota", "land cruiser", 2500),
                new Car("mitsubishi", "lancer", 1150),
                new Car("jeep", "wrangler", 1700)
        );
        printCars(cars, (c1) -> c1.getPrice() >= 1150 && c1.getPrice() <= 1700);
    }

    public static void printCars(List<Car> cars, Predicate<Car> condition) {
        cars.forEach(car -> {
            if (condition.test(car)) {
                LOGGER.info("car {}", car);
            }
        });
    }

    public static void printCarsPriceRange(List<Car> cars, int low, int high) {
        cars.stream()
                .filter(car -> car.getPrice() >= low && car.getPrice() <= high)
                .forEach(car -> LOGGER.info("car {}", car));
    }

    public static void printCarsByCompany(List<Car> cars) {
        cars.stream()
                .sorted(Comparator.comparing(Car::getCompany))
                .forEach(car -> LOGGER.info("car {}", car));
    }
}
