package com.example.GoKart.dto.request;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class OrderRequest {

    String customerEmail;
    List<ItemRequest> itemRequests;

}
