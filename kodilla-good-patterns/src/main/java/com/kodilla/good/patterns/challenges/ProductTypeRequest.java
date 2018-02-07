package com.kodilla.good.patterns.challenges;

public class ProductTypeRequest {
    private ProductAvaliableChecking productAvaliableChecking;

    public ProductAvaliableChecking retrieve() {

        ProductType productOne = new ProductType("Football Game", "30$");

        return new ProductAvaliableChecking(productOne, true);
    }
}
