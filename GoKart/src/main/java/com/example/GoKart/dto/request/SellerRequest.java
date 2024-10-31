package com.example.GoKart.dto.request;

import jakarta.persistence.Column;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SellerRequest {

    String name;

    String email;

    String pan;
}
