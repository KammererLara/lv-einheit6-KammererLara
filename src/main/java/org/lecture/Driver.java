package org.lecture;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Driver {

    public static void main(String[] args) {
        Car bmw = new Car(false, 127.50, 5, 4);
        Car vw = new Car(true, 86.99, 5, 5);
        Bicycle ktm = new Bicycle(true, 19.90, 41);
        Bicycle scottContessa = new Bicycle(false, 21.30, 49);

        Vehicle[] vehicles = {bmw, vw, ktm, scottContessa};
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }

}
