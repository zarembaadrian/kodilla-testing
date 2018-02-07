package com.kodilla.good.patterns.challenges;

public class ProductAvaliableChecking implements ProductAvaliable {
    private ProductType productType;
    private boolean productAvaliable;

    public ProductAvaliableChecking(ProductType productType, boolean productAvaliable) {
        this.productType = productType;
        this.productAvaliable = productAvaliable;
    }

    public ProductType getProductType() {
        return productType;
    }

    public boolean isProductAvaliable() {
        return productAvaliable;
    }
}
