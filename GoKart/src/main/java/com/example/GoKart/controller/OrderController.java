package com.example.GoKart.controller;

import com.example.GoKart.dto.request.OrderRequest;
import com.example.GoKart.dto.response.OrderResponse;
import com.example.GoKart.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping
    public ResponseEntity placeOrder(@RequestBody OrderRequest orderRequest) {
         OrderResponse orderResponse = orderService.placeOrder(orderRequest);
         return new ResponseEntity<>(orderResponse, HttpStatus.CREATED);
    }

}
