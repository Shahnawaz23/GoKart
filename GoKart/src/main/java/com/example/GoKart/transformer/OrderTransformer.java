package com.example.GoKart.transformer;

import com.example.GoKart.dto.request.OrderRequest;
import com.example.GoKart.dto.response.OrderResponse;
import com.example.GoKart.dto.response.ProductResponse;
import com.example.GoKart.model.Enum.OrderStatus;
import com.example.GoKart.model.OrderEntity;
import com.example.GoKart.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderTransformer {
    public static OrderEntity orderRequestToOrderEntity(int totalValue) {
        return OrderEntity.builder()
                .orderNo(String.valueOf(UUID.randomUUID()))
                .totalValue(totalValue)
                .orderStatus(OrderStatus.PLACED)
                .build();
    }

    public static OrderResponse orderToOrderResponse(OrderEntity order) {
        OrderResponse orderResponse =  OrderResponse.builder()
                .orderNo(order.getOrderNo())
                .totalValue(order.getTotalValue())
                .orderStatus(order.getOrderStatus())
                .orderAt(order.getOrderAt())
                .customer(CustomerTransformer.customerToCustomerResponse(order.getCustomer()))
                .build();

        List<ProductResponse> productResponses = new ArrayList<>();
        for (Product product: order.getProducts()) {
            productResponses.add(ProductTransformer.productToProductResponse(product));
        }

        orderResponse.setProducts(productResponses);
        return orderResponse;
        
    }
}
