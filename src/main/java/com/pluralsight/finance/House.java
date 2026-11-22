package com.pluralsight.finance;

import java.math.BigDecimal;

public class House extends FixedAsset {
    private String address;
    private int condition;  //(1 -excellent, 2 -good, 3 -fair, 4 -poor)
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, BigDecimal originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = checkedCondition(condition);
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        int pricePerSquareFoot = switch (condition) {
            case 1 -> 180; // excellent
            case 2 -> 130; // good
            case 3 -> 90;  // fair
            case 4 -> 80;  // poor
            default -> throw new IllegalStateException("Unknown house condition.");
        };

        BigDecimal buildingValue =
                BigDecimal.valueOf(squareFoot)
                        .multiply(BigDecimal.valueOf(pricePerSquareFoot));

        BigDecimal landValue =
                BigDecimal.valueOf(lotSize)
                        .multiply(new BigDecimal("0.25"));

        return buildingValue.add(landValue).doubleValue();
    }


    private static int checkedCondition(int condition) {
        if (condition < 1 || condition > 4) {
            throw new IllegalArgumentException("Condition must be 1 through 4.");
        }
        return condition;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = checkedCondition(condition);
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}