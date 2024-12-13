package com.example.controller;

import com.example.model.Inventory;
import com.example.service.InventoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService service;

    public InventoryController(InventoryService service) {
        this.service = service;
    }

    @GetMapping("/{skuCode}")
    public Inventory getInventory(@PathVariable String skuCode) {
        return service.getInventoryBySkuCode(skuCode);
    }
}