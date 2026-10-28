package com.example.GoKart.dto.request;
import java.util.List;
public class OrderRequest {

    String customerEmail;
    List<ItemRequest> itemRequests;
    public OrderRequest() {}

    public OrderRequest(String customerEmail, List<ItemRequest> itemRequests) {
        this.customerEmail = customerEmail;
        this.itemRequests = itemRequests;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private String customerEmail;
        private List<ItemRequest> itemRequests;

        public Builder customerEmail(String customerEmail) { this.customerEmail = customerEmail; return this; }

        public Builder itemRequests(List<ItemRequest> itemRequests) { this.itemRequests = itemRequests; return this; }

        public OrderRequest build() { return new OrderRequest(customerEmail, itemRequests); }
    }


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
