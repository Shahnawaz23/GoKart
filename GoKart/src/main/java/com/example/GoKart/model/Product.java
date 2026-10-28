package com.example.GoKart.model;

import com.example.GoKart.dto.response.SellerResponse;
import com.example.GoKart.model.Enum.Category;
import com.example.GoKart.model.Enum.ProductStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String productName;

    private int price;

    private int quantity;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Seller seller;


    @ManyToMany
    @JsonIgnore
    @JoinTable(name= "product_orders",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "order_entity_id"))
    private List<OrderEntity> orders = new ArrayList<>();
    public Product() {}

    public Product(int id, String productName, int price, int quantity, Category category, ProductStatus productStatus, Seller seller, List<OrderEntity> orders) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.productStatus = productStatus;
        this.seller = seller;
        this.orders = orders;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private int id;
        private String productName;
        private int price;
        private int quantity;
        private Category category;
        private ProductStatus productStatus;
        private Seller seller;
        private List<OrderEntity> orders;

        public Builder id(int id) { this.id = id; return this; }

        public Builder productName(String productName) { this.productName = productName; return this; }

        public Builder price(int price) { this.price = price; return this; }

        public Builder quantity(int quantity) { this.quantity = quantity; return this; }

        public Builder category(Category category) { this.category = category; return this; }

        public Builder productStatus(ProductStatus productStatus) { this.productStatus = productStatus; return this; }

        public Builder seller(Seller seller) { this.seller = seller; return this; }

        public Builder orders(List<OrderEntity> orders) { this.orders = orders; return this; }

        public Product build() { return new Product(id, productName, price, quantity, category, productStatus, seller, orders); }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ProductStatus getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(ProductStatus productStatus) {
        this.productStatus = productStatus;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public List<OrderEntity> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderEntity> orders) {
        this.orders = orders;
    }
}
