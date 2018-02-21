package com.kodilla.good.patterns.challenges.producent;

public interface OrderService {
    boolean process(String supplierName, Order order);
    void addSupplier(Supplier supplier);
}
