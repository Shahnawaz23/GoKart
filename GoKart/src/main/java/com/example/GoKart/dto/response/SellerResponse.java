package com.example.GoKart.dto.response;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SellerResponse {

    String name;

    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
