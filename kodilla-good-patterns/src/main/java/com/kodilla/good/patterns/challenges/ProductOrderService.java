package com.kodilla.good.patterns.challenges;

public class ProductOrderService {


    public boolean purchaseProcess(ProductAvaliableChecking productAvaliableChecking) {
        boolean productAvaliable = productAvaliableChecking.isProductAvaliable();
        return productAvaliable;
    }
}
