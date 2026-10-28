package com.example.GoKart.dto.request;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequest {

    String customerEmail;
    List<ItemRequest> itemRequests;

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public List<ItemRequest> getItemRequests() {
        return itemRequests;
    }

    public void setItemRequests(List<ItemRequest> itemRequests) {
        this.itemRequests = itemRequests;
    }
}
