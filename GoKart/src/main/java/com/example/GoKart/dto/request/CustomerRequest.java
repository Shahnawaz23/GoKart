package com.example.GoKart.dto.request;

import com.example.GoKart.model.Enum.Gender;
public class CustomerRequest {

    String name;

    int age;

    String email;

    Gender gender;
    public CustomerRequest() {}

    public CustomerRequest(String name, int age, String email, Gender gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private String name;
        private int age;
        private String email;
        private Gender gender;

        public Builder name(String name) { this.name = name; return this; }

        public Builder age(int age) { this.age = age; return this; }

        public Builder email(String email) { this.email = email; return this; }

        public Builder gender(Gender gender) { this.gender = gender; return this; }

        public CustomerRequest build() { return new CustomerRequest(name, age, email, gender); }
    }


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
