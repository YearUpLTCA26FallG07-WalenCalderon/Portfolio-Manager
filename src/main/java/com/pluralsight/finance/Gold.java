package com.pluralsight.finance;

import java.math.BigDecimal;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String description, String dateAcquired, BigDecimal originalCost, double weight) {
        super(description, dateAcquired, originalCost);
        this .weight = weight;

    }

    @Override
    public double getValue(){


        return 0;
    };




}
