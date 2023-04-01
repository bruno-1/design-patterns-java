// Code taken from the site: https://refactoring.guru
/*
	Use the Builder pattern to get rid of a “telescoping constructor”.

	Use the Builder pattern when you want your code to be able to create different
	representations of some product (for example, stone and wooden houses).

	Use the Builder to construct Composite trees or other complex objects.
*/
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