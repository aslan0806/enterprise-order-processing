package com.example.controller;

import com.example.model.Payment;
import com.example.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    @PostMapping
    public Payment processPayment(@RequestBody Payment payment) {
        return service.processPayment(payment);
    }
}