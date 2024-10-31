package com.example.GoKart.dto.response;

import com.example.GoKart.model.Enum.Category;
import com.example.GoKart.model.Enum.ProductStatus;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductResponse {

    String productName;

    int price;

    int quantity;

    Category category;

    ProductStatus productStatus;

    SellerResponse seller;
}
