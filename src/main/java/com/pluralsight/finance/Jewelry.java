package com.pluralsight.finance;

import java.math.BigDecimal;

public class Jewelry extends FixedAsset {
    private double karat;


    public Jewelry(String description, String dateAcquired, BigDecimal originalCost, double karat) {
        super(description, dateAcquired, originalCost);
        this.karat = karat;
    }



    @Override
    public double getValue(){


        return 0;
    };







}
