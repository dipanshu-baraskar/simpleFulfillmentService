package com.phonepe.simplefulfillmentservice.service;

import com.phonepe.simplefulfillmentservice.entity.Product;

import java.util.Map;

public interface InventoryService {
    String addInventory(Product product);

    String removeInventory(String id);

    Map<String, Integer> getProducts();
}
