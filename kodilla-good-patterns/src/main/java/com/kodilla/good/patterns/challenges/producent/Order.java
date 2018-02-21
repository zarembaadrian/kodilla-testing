package com.kodilla.good.patterns.challenges.producent;

public class Order {
    private String nameOfProduct;
    private int quantityOfProduct;

    public Order(String nameOfProduct, int quantityOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.quantityOfProduct = quantityOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }
}
