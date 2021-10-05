package com.company;

public class Main {

    public static void main(String[] args) {
	Cars cars = new Rav4();
	cars = new LeatherInterior(cars);
	System.out.println(cars.getDescription() + " - " +cars.cost() + "$");

        Cars cars1 = new Camry70();
        cars1 = new PanoramicTop(cars1);
        System.out.println(cars1.getDescription() + " - " +cars1.cost() + "$");

        Cars cars2 = new LandCruiser();
        cars2 = new PanoramicTop(cars2);
        cars2 = new KeylessControl(cars2);
        cars2 = new LeatherInterior(cars2);
        System.out.println(cars2.getDescription() + " - " +cars2.cost() + "$");


    }

}
