package com.phonepe.simplefulfillmentservice.controller;

import com.phonepe.simplefulfillmentservice.entity.*;
import com.phonepe.simplefulfillmentservice.exception.InvalidQuantityException;
import com.phonepe.simplefulfillmentservice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/add")
    public ResponseEntity<AddProductResponse> addInventory(@RequestBody Product product) {
        if (product.getAmount() == 0) {
            throw new InvalidQuantityException("Invalid quantity.");
        }
        return new ResponseEntity(new AddProductResponse(inventoryService.addInventory(product)), HttpStatus.CREATED);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<DeleteProductResponse> removeInventory(@PathVariable String id) {
        return new ResponseEntity(new DeleteProductResponse(inventoryService.removeInventory(id)), HttpStatus.NO_CONTENT);

    }

    @GetMapping("/view")
    public ResponseEntity<GetProductResponse> viewInventory() {
        return new ResponseEntity(new GetProductResponse(inventoryService.getProducts()), HttpStatus.OK);

    }
}
