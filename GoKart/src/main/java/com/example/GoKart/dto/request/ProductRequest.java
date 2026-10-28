package com.example.GoKart.dto.request;

import com.example.GoKart.model.Enum.Category;
public class ProductRequest {

    String productName;

    int price;

    Category category;

    int quantity;
    public ProductRequest() {}

    public ProductRequest(String productName, int price, Category category, int quantity) {
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private String productName;
        private int price;
        private Category category;
        private int quantity;

        public Builder productName(String productName) { this.productName = productName; return this; }

        public Builder price(int price) { this.price = price; return this; }

        public Builder category(Category category) { this.category = category; return this; }

        public Builder quantity(int quantity) { this.quantity = quantity; return this; }

        public ProductRequest build() { return new ProductRequest(productName, price, category, quantity); }
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
