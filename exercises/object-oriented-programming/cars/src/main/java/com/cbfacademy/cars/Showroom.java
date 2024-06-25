package com.cbfacademy.cars;

import java.util.LinkedList;
import java.util.List;

public class Showroom {
    
    public List<Car> cars = new LinkedList<>();
    
    public void setCars(List<Car> cars) {
        this.cars = cars;
     }

    public List<Car> getCars() {
        return this.cars;
    }
  
}
