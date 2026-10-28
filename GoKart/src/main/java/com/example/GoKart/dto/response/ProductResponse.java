package com.example.GoKart.dto.response;

import com.example.GoKart.model.Enum.Category;
import com.example.GoKart.model.Enum.ProductStatus;
public class ProductResponse {

    String productName;

    int price;

    int quantity;

    Category category;

    ProductStatus productStatus;

    SellerResponse seller;
    public ProductResponse() {}

    public ProductResponse(String productName, int price, int quantity, Category category, ProductStatus productStatus, SellerResponse seller) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.productStatus = productStatus;
        this.seller = seller;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private String productName;
        private int price;
        private int quantity;
        private Category category;
        private ProductStatus productStatus;
        private SellerResponse seller;

        public Builder productName(String productName) { this.productName = productName; return this; }

        public Builder price(int price) { this.price = price; return this; }

        public Builder quantity(int quantity) { this.quantity = quantity; return this; }

        public Builder category(Category category) { this.category = category; return this; }

        public Builder productStatus(ProductStatus productStatus) { this.productStatus = productStatus; return this; }

        public Builder seller(SellerResponse seller) { this.seller = seller; return this; }

        public ProductResponse build() { return new ProductResponse(productName, price, quantity, category, productStatus, seller); }
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

    public SellerResponse getSeller() {
        return seller;
    }

    public void setSeller(SellerResponse seller) {
        this.seller = seller;
    }
}
