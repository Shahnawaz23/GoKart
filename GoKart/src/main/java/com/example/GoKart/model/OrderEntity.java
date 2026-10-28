package com.example.GoKart.model;


import com.example.GoKart.model.Enum.OrderStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.security.cert.CertPathBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String orderNo;   //UUID

    private double totalValue;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @CreationTimestamp      //generate date at creation time
    private Date orderAt;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Customer customer;

    @ManyToMany(mappedBy = "orders")
    private List<Product> products = new ArrayList<>();
    public OrderEntity() {}

    public OrderEntity(int id, String orderNo, double totalValue, OrderStatus orderStatus, Date orderAt, Customer customer, List<Product> products) {
        this.id = id;
        this.orderNo = orderNo;
        this.totalValue = totalValue;
        this.orderStatus = orderStatus;
        this.orderAt = orderAt;
        this.customer = customer;
        this.products = products;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private int id;
        private String orderNo;
        private double totalValue;
        private OrderStatus orderStatus;
        private Date orderAt;
        private Customer customer;
        private List<Product> products;

        public Builder id(int id) { this.id = id; return this; }

        public Builder orderNo(String orderNo) { this.orderNo = orderNo; return this; }

        public Builder totalValue(double totalValue) { this.totalValue = totalValue; return this; }

        public Builder orderStatus(OrderStatus orderStatus) { this.orderStatus = orderStatus; return this; }

        public Builder orderAt(Date orderAt) { this.orderAt = orderAt; return this; }

        public Builder customer(Customer customer) { this.customer = customer; return this; }

        public Builder products(List<Product> products) { this.products = products; return this; }

        public OrderEntity build() { return new OrderEntity(id, orderNo, totalValue, orderStatus, orderAt, customer, products); }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderAt() {
        return orderAt;
    }

    public void setOrderAt(Date orderAt) {
        this.orderAt = orderAt;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
