package com.company;

public class LeatherInterior extends Decorator{
    Cars cars;

    public LeatherInterior (Cars cars){
        this.cars = cars;
    }

    public String getDescription() {
        return cars.getDescription()+ ", LeatherInterior";

    }

    public double cost() {
        return 7000 + cars.cost();
    }
}
