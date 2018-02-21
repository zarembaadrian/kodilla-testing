package com.kodilla.good.patterns.challenges.shop;

import com.kodilla.good.patterns.challenges.ProductType;

public interface OrderRepositoryInterface {
    void createOrder(ProductType productType);
}
