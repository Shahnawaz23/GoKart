package com.example.GoKart.dto.request;

import com.example.GoKart.model.Enum.Gender;
import lombok.*;
import lombok.Builder;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CustomerRequest {

    String name;

    int age;

    String email;

    Gender gender;

}
