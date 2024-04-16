package org.lecture;

public class Bicycle extends Vehicle{
    private double frameSize;

    public Bicycle(boolean available, double rentalPricePerDay, double frameSize) {
        super(available, rentalPricePerDay);
        this.frameSize = frameSize;
    }

    @Override
    public void displayInfo() {
        System.out.printf("""
                Bicycle data:
                ID: %s
                Frame size: %.2f
                Rental price per day: %.2f
                %s%s
                
                """, getId().toString(), frameSize, getRentalPricePerDay(),
                isAvailable() ? "\u001B[32mstill available" : "\u001B[31mnot available", "\u001B[0m");
    }
}
