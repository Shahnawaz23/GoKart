package com.example.GoKart.dto.request;
import java.util.List;
public class ItemRequest {
    int id;
    int requiredQuantity;

    public ItemRequest() {}
    public ItemRequest(int id, int requiredQuantity) {
        this.id = id;
        this.requiredQuantity = requiredQuantity;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRequiredQuantity() {
        return requiredQuantity;
    }

    public void setRequiredQuantity(int requiredQuantity) {
        this.requiredQuantity = requiredQuantity;
    }
}
