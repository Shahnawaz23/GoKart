package com.example.GoKart.dto.request;

import com.example.GoKart.model.Enum.Gender;
import lombok.*;
import lombok.Builder;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerRequest {

    String name;

    int age;

    String email;

    Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
