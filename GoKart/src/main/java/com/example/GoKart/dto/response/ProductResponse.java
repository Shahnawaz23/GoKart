package com.example.GoKart.dto.response;

import com.example.GoKart.model.Enum.Category;
import com.example.GoKart.model.Enum.ProductStatus;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponse {

    String productName;

    int price;

    int quantity;

    Category category;

    ProductStatus productStatus;

    SellerResponse seller;

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
