package com.phonepe.simplefulfillmentservice.service;

import com.phonepe.simplefulfillmentservice.entity.Product;
import com.phonepe.simplefulfillmentservice.repository.InventoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryDao inventoryDao;

    public String addInventory(Product product) {
        String s = inventoryDao.save(product);
        return "Added inventory for product " + s;
    }

    public String removeInventory(String id) {
        String s = inventoryDao.remove(id);
        return "Removed inventory for product " + s;
    }

    public Map<String, Integer> getProducts() {
        return inventoryDao.getAllProducts();
    }
}
