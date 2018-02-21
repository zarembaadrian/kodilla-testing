package com.kodilla.good.patterns.challenges.producent;

public class HealthyShop implements Supplier {
     private String name;

    public HealthyShop(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean process(Order order) {
        return false;
    }
}
