package com.kodilla.good.patterns.challenges.producent;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImp implements OrderService {
    private List<Supplier> supplierList = new ArrayList<>();

    @Override
    public boolean process(String supplierName, Order order) {
        for(Supplier supplier:supplierList) {
            if(supplier.getName().equals(supplierName)) {
               return supplier.process(order);
            }
        }
        return false;
    }

    @Override
    public void addSupplier(Supplier supplier) {
        supplierList.add(supplier);
    }


}
