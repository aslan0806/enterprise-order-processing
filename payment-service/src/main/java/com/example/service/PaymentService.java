package com.example.service;

import com.example.model.Payment;
import com.example.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentRepository repository;

    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public Payment processPayment(Payment payment) {
        return repository.save(payment);
    }
}