package com.kodilla.good.patterns.challenges.shop;

import com.kodilla.good.patterns.challenges.ProductType;

public class OrderRepository implements OrderRepositoryInterface {


    @Override
    public void createOrder(ProductType productType) {
        System.out.println("Order saved!");
    }
}
