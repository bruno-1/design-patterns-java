// Code taken from the site: https://refactoring.guru
package com.studies.designpatterns.creational.builder;

import com.studies.designpatterns.creational.builder.builders.CarBuilder;
import com.studies.designpatterns.creational.builder.builders.CarManualBuilder;
import com.studies.designpatterns.creational.builder.cars.Car;
import com.studies.designpatterns.creational.builder.cars.Manual;
import com.studies.designpatterns.creational.builder.director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructorSportsCar(builder);
        
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
        
        CarManualBuilder manualBuilder = new CarManualBuilder();
        
        director.constructorSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}