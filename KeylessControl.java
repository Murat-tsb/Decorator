package com.company;

public class KeylessControl extends Decorator{
    Cars cars;

    public KeylessControl (Cars cars){
        this.cars = cars;
    }

    public String getDescription() {
        return cars.getDescription()+ ", Keyless control";

    }

    public double cost() {
        return 4000 + cars.cost();
    }
}
