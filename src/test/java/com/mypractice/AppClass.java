package com.mypractice;

import java.util.ArrayList;
import java.util.Collections;

public class AppClass {

    public static void main(String[] args){
        Car auto = new AutomaticCar();
        goToCity(auto);
        Car man = new ManualCar();
        goToCity(man);





    }

    public static void goToCity(Car car) {
        car.drive();
    }

}
