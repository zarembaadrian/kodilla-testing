package com.kodilla.good.patterns.challenges.producent;

public class ExtraFoodShop implements Supplier {
     private String name;

    public ExtraFoodShop(String name) {
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
