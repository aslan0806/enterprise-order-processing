package com.example.service;

import com.example.model.Inventory;
import com.example.repository.InventoryRepository;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    private final InventoryRepository repository;

    public InventoryService(InventoryRepository repository) {
        this.repository = repository;
    }

    public Inventory getInventoryBySkuCode(String skuCode) {
        return repository.findBySkuCode(skuCode);
    }
}