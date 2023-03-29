package com.phonepe.simplefulfillmentservice.repository;

import com.phonepe.simplefulfillmentservice.entity.Product;

import java.util.Map;

public interface InventoryDao {
    String save(Product product);

    String remove(String id);

    Map<String, Integer> getAllProducts();
}
