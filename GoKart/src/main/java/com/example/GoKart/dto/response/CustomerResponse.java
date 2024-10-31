package com.example.GoKart.dto.response;


import lombok.*;
import lombok.Builder;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CustomerResponse {

    String name;
    String email;
}
