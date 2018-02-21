package com.kodilla.good.patterns.challenges.shop;

import com.kodilla.good.patterns.challenges.ProductType;

public class OrderDto {
    private ProductType productType;
    private boolean purchase;

    public OrderDto(ProductType productType, boolean purchase) {
        this.productType = productType;
        this.purchase = purchase;
    }

}
