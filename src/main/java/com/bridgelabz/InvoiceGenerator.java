package com.bridgelabz;

public class InvoiceGenerator {
    private static final double MINIMUM_COST_PER_KM = 10;
    private static final int COST_PER_MIN = 1;
    private static final int MINIMUM_FARE = 5;

    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_MIN;
        if (totalFare <= MINIMUM_FARE)
            return MINIMUM_FARE;
        return totalFare;
    }

}

