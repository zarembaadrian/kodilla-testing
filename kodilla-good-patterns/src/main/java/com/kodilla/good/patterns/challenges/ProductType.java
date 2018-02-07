package com.kodilla.good.patterns.challenges;

public class ProductType {
    private String productName;
    private String productPrice;

    public ProductType(String productName, String productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

}
