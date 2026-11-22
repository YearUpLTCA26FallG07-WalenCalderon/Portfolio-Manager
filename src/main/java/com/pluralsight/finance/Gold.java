package com.pluralsight.finance;

import java.math.BigDecimal;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String description, String dateAcquired, BigDecimal originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this .weight = weight;
        this.condition = checkedCondition(condition);

    }

    @Override
    public double getValue(){


        return 0;
    };




}
