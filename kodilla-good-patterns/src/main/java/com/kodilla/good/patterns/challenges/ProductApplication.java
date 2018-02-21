package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.shop.OrderProcessor;
import com.kodilla.good.patterns.challenges.shop.OrderRepository;

public class ProductApplication {

    public static void main(String[] args) {
        ProductTypeRequest productTypeRequest = new ProductTypeRequest();
        ProductAvaliableChecking retrieve = productTypeRequest.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new ProductInformationService(), new ProductOrderService(), new OrderRepository());

        orderProcessor.process(retrieve);

    }
}