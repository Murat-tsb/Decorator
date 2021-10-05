package com.company;

public class PanoramicTop extends Decorator{
    Cars cars;

    public PanoramicTop (Cars cars){
        this.cars = cars;
    }

    public String getDescription() {
        return cars.getDescription()+ ", PanoramicTop";

    }

    public double cost() {
        return 2000 + cars.cost();
    }
}
