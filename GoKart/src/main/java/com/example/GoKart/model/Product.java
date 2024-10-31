package com.example.GoKart.model;

import com.example.GoKart.dto.response.SellerResponse;
import com.example.GoKart.model.Enum.Category;
import com.example.GoKart.model.Enum.ProductStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)   // to make fields private(methods, variables) it has least priority
@Entity
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String productName;

    int price;

    int quantity;

    @Enumerated(EnumType.STRING)
    Category category;

    @Enumerated(EnumType.STRING)
    ProductStatus productStatus;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Seller seller;


    @ManyToMany
    @JsonIgnore
    @JoinTable(name= "product_orders",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "order_entity_id"))
    List<OrderEntity> orders = new ArrayList<>();

}
