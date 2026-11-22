package com.pluralsight.finance;

import java.math.BigDecimal;

public abstract class FixedAsset implements Valuable {
    private String assetName;
    private double marketValue;
    private String description;
    private String dateAcquired;
    private BigDecimal originalCost;

    public FixedAsset(String description, String dateAcquired, BigDecimal originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    // returns original cost
    public abstract double getValue();


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public BigDecimal getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(BigDecimal originalCost) {
        this.originalCost = originalCost;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Asset{");
        sb.append("description='").append(description).append('\'');
        sb.append(", dateAcquired='").append(dateAcquired).append('\'');
        sb.append(", originalCost=").append(originalCost);
        sb.append(", value=").append(this.getValue());
        sb.append('}');
        return sb.toString();
    }

}
