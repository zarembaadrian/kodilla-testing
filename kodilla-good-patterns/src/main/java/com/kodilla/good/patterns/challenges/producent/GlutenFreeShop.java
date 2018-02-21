package com.kodilla.good.patterns.challenges.producent;

public class GlutenFreeShop implements Supplier {
     private String name;

    public GlutenFreeShop(String name) {
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
