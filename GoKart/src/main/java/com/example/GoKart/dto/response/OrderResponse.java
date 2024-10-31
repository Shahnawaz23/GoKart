package com.example.GoKart.dto.response;

import com.example.GoKart.model.Enum.OrderStatus;
import lombok.*;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class OrderResponse {

    String orderNo;
    double totalValue;
    OrderStatus orderStatus;
    Date orderAt;
    CustomerResponse customer;
    List<ProductResponse> products;

}
