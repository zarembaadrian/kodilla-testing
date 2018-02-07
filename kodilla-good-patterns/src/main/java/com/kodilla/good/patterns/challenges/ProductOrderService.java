package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private ProductAvaliableChecking productAvaliableChecking;
    private ProductInformationService productInformationService;
    private ProductTypeRequest productTypeRequest;

    public void purchaseProcess(ProductAvaliableChecking productAvaliableChecking) {

        boolean productAvaliable = productAvaliableChecking.isProductAvaliable();

        if(productAvaliable = true) {
            productInformationService.sendConfirmationOfPurchase();
        }
        else {
            productInformationService.sendPurchaseReject();
        }
    }
}
