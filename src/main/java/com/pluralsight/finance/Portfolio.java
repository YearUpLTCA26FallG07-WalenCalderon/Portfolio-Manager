package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio implements Valuable{
    private String name;
    private String owner;
    private List<Valuable> assets = new ArrayList<Valuable>();


    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable asset){
        List<Valuable> assets = this.assets;
        assets.add(asset);
    }
    @Override
    public double getValue(){
        double value = 0;
        for(Valuable asset : assets){
            value += asset.getValue();
        }
        return value;
    }

    public Valuable getMostValuable(){
        if (assets.isEmpty()) {
            return null;
        }

        Valuable mostValuable = assets.get(0);

        for (int i = 1; i < assets.size(); i++) {
            Valuable asset = assets.get(i);
            if (asset.getValue() > mostValuable.getValue()) {
                mostValuable = asset;
            }
        }

        return mostValuable;
    }

    public Valuable getLeastValuable(){
        if (assets.isEmpty()){
            return null;
        }

        Valuable leastValuable = assets.get(0);

        for (int i = 1; i < assets.size(); i++) {
            Valuable asset = assets.get(i);
            if (asset.getValue() < leastValuable.getValue()) {
                leastValuable = asset;
            }
        }

        return leastValuable;
    }

}

