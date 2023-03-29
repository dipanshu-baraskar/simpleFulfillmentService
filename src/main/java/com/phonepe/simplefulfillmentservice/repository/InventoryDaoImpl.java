package com.phonepe.simplefulfillmentservice.repository;

import com.phonepe.simplefulfillmentservice.entity.Product;
import com.phonepe.simplefulfillmentservice.exception.EmptyCartException;
import com.phonepe.simplefulfillmentservice.exception.ProductNotExistException;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InventoryDaoImpl implements InventoryDao {

    private Map<String, Integer> productMap;

    public InventoryDaoImpl() {
        productMap = new HashMap<>();
    }

    public String save(Product product) {

        if (productMap.containsKey(product.getId())) {
            productMap.put(product.getId(), productMap.get(product.getId()) + product.getAmount());
        } else {
            productMap.put(product.getId(), product.getAmount());
        }
        return product.getId();
    }

    public String remove(String id) {
        if (productMap.containsKey(id)) {
            Integer quantity = productMap.get(id);
            if (quantity == 0) {
                throw new EmptyCartException("Cart is empty");
            } else if (quantity == 1) {
                productMap.remove(id);
                return id;
            }
            productMap.put(id, quantity - 1);
            return id;
        } else {
            throw new ProductNotExistException(id + " doesn't exist.");
        }
    }

    public Map<String, Integer> getAllProducts() {
        if (productMap.isEmpty()) {
            throw new EmptyCartException("Cart is empty");
        }
        return productMap;
    }
}
