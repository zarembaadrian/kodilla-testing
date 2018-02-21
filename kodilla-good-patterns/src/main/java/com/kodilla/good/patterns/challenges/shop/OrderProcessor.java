package com.kodilla.good.patterns.challenges.shop;

import com.kodilla.good.patterns.challenges.ProductAvaliableChecking;
import com.kodilla.good.patterns.challenges.ProductInformationService;
import com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderProcessor {
    private ProductInformationService productInformationService;
    private ProductOrderService productOrderService;
    private OrderRepositoryInterface orderRepositoryInterface;

    public OrderProcessor(ProductInformationService productInformationService, ProductOrderService productOrderService, OrderRepositoryInterface orderRepositoryInterface) {
        this.productInformationService = productInformationService;
        this.productOrderService = productOrderService;
        this.orderRepositoryInterface = orderRepositoryInterface;
    }

    public OrderDto process(ProductAvaliableChecking productAvaliableChecking) {

        if (productOrderService.purchaseProcess(productAvaliableChecking)) {
            productInformationService.sendConfirmationOfPurchase(productAvaliableChecking.getProductType());
            orderRepositoryInterface.createOrder(productAvaliableChecking.getProductType());
            return new OrderDto(productAvaliableChecking.getProductType(),true);
        }
        else {
            productInformationService.sendPurchaseReject(productAvaliableChecking.getProductType());
            return new OrderDto(productAvaliableChecking.getProductType(), false);
        }
    }
}
