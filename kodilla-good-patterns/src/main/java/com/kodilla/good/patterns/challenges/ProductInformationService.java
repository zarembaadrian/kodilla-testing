package com.kodilla.good.patterns.challenges;

public class ProductInformationService implements ProductInformation {
    private ProductType productType;

    public void sendConfirmationOfPurchase() {
        System.out.println("Well done, you just bought: " + productType.getProductName() +
                ". This product cost you: " + productType.getProductPrice());
    }

    public void sendPurchaseReject() {
        System.out.print("Sorry but your product: ''" + productType.getProductName() + "'' is not in stock anymore");
    }
}
