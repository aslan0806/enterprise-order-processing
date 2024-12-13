package com.example.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private Integer quantity;
    private Double totalPrice;
    private LocalDateTime orderDate;

    // Геттеры и сеттеры
}