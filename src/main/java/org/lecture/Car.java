package org.lecture;

public class Car extends Vehicle {
    private int numberOfDoors;
    private int numberOfPassengers;

    public Car(boolean available, double rentalPricePerDay, int numberOfDoors, int numberOfPassengers) {
        super(available, rentalPricePerDay);
        this.numberOfDoors = numberOfDoors;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void displayInfo() {
        System.out.printf("""
                Car data:
                ID: %s
                Number of doors: %d
                Number of passengers: %d
                Rental price per day: %.2f
                %s%s
                
                """, getId().toString(), numberOfDoors, numberOfPassengers, getRentalPricePerDay(),
                isAvailable() ? "\u001B[32mstill available" : "\u001B[31mnot available", "\u001B[0m");
    }
}
