package com.company.homework.collections.lists;

public class Vehicle {

    private String make;
    private String model;
    private int price;
    private boolean fourDrive;

    public Vehicle() {
    }

    public Vehicle(String make, String model, int price, boolean fourDrive) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.fourDrive = fourDrive;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFourDrive() {
        return fourDrive;
    }

    public void setFourDrive(boolean fourDrive) {
        this.fourDrive = fourDrive;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fourDrive=" + fourDrive +
                '}';
    }
}
