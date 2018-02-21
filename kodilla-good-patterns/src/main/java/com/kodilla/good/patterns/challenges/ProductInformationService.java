package com.kodilla.good.patterns.challenges;

public class ProductInformationService implements ProductInformation {

    public void sendConfirmationOfPurchase(ProductType productType) {
        System.out.println("Well done, you just bought: " + productType.getProductName() +
                ". This product cost you: " + productType.getProductPrice());
    }

    public void sendPurchaseReject(ProductType productType) {
        System.out.print("Sorry but your product: ''" + productType.getProductName() + "'' is not in stock anymore");
    }
}
