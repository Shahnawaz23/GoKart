package com.example.GoKart.model;


import com.example.GoKart.model.Enum.OrderStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.security.cert.CertPathBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)   // to make fields private(methods, variables) it has least priority
@Entity
@Builder
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String orderNo;   //UUID

    double totalValue;

    @Enumerated(EnumType.STRING)
    OrderStatus orderStatus;

    @CreationTimestamp      //generate date at creation time
    Date orderAt;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Customer customer;

    @ManyToMany(mappedBy = "orders")
    List<Product> products = new ArrayList<>();
}
