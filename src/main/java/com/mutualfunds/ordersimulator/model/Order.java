package com.mutualfunds.ordersimulator.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fundName;
    private String investorName;
    private Double amount;
    private String orderType; // BUY or SELL
}
