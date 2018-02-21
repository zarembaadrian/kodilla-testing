package com.kodilla.good.patterns.challenges.producent;

public interface Supplier {
    boolean process(Order order);
    String getName();
}
