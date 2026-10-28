package com.example.GoKart.dto.response;

import com.example.GoKart.model.Enum.OrderStatus;
import java.util.Date;
import java.util.List;
public class OrderResponse {

    String orderNo;
    double totalValue;
    OrderStatus orderStatus;
    Date orderAt;
    CustomerResponse customer;
    List<ProductResponse> products;
    public OrderResponse() {}

    public OrderResponse(String orderNo, double totalValue, OrderStatus orderStatus, Date orderAt, CustomerResponse customer, List<ProductResponse> products) {
        this.orderNo = orderNo;
        this.totalValue = totalValue;
        this.orderStatus = orderStatus;
        this.orderAt = orderAt;
        this.customer = customer;
        this.products = products;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private String orderNo;
        private double totalValue;
        private OrderStatus orderStatus;
        private Date orderAt;
        private CustomerResponse customer;
        private List<ProductResponse> products;

        public Builder orderNo(String orderNo) { this.orderNo = orderNo; return this; }

        public Builder totalValue(double totalValue) { this.totalValue = totalValue; return this; }

        public Builder orderStatus(OrderStatus orderStatus) { this.orderStatus = orderStatus; return this; }

        public Builder orderAt(Date orderAt) { this.orderAt = orderAt; return this; }

        public Builder customer(CustomerResponse customer) { this.customer = customer; return this; }

        public Builder products(List<ProductResponse> products) { this.products = products; return this; }

        public OrderResponse build() { return new OrderResponse(orderNo, totalValue, orderStatus, orderAt, customer, products); }
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

    public CustomerResponse getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerResponse customer) {
        this.customer = customer;
    }

    public List<ProductResponse> getProducts() {
        return products;
    }

    public void setProducts(List<ProductResponse> products) {
        this.products = products;
    }
}
