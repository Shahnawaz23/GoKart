package com.example.GoKart.dto.request;

import com.example.GoKart.model.Enum.Category;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRequest {

    String productName;

    int price;

    Category category;

    int quantity;

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
