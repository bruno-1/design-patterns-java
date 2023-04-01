// Code taken from the site: https://refactoring.guru
package com.studies.designpatterns.creational.builder.director;

import com.studies.designpatterns.creational.builder.builders.Builder;
import com.studies.designpatterns.creational.builder.cars.CarType;
import com.studies.designpatterns.creational.builder.components.Engine;
import com.studies.designpatterns.creational.builder.components.GPSNavigator;
import com.studies.designpatterns.creational.builder.components.Transmission;
import com.studies.designpatterns.creational.builder.components.TripComputer;

public class Director {
    public void constructorSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
    
    public void constructorCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
    
    public void constructorSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
