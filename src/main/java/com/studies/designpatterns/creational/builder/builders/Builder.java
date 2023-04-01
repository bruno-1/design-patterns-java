// Code taken from the site: https://refactoring.guru
package com.studies.designpatterns.creational.builder.builders;

import com.studies.designpatterns.creational.builder.cars.CarType;
import com.studies.designpatterns.creational.builder.components.Engine;
import com.studies.designpatterns.creational.builder.components.GPSNavigator;
import com.studies.designpatterns.creational.builder.components.Transmission;
import com.studies.designpatterns.creational.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
