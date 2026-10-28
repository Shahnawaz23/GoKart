package com.example.GoKart.dto.response;


import lombok.*;
import lombok.Builder;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerResponse {

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
