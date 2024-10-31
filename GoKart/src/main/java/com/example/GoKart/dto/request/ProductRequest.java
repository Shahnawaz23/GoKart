package com.example.GoKart.dto.request;

import com.example.GoKart.model.Enum.Category;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductRequest {

    String productName;

    int price;

    Category category;

    int quantity;
}
