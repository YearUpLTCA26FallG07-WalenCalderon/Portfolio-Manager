package com.pluralsight.finance;

import java.math.BigDecimal;

public class Jewelry extends FixedAsset {
    private double karat;


    public Jewelry(String description, String dateAcquired, BigDecimal originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.karat = karat;
        this.condition = checkedCondition(condition);
    }



    @Override
    public double getValue(){


        return 0;
    };







}
