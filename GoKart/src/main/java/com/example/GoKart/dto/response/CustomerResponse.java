package com.example.GoKart.dto.response;
public class CustomerResponse {

    String name;
    String email;
    public CustomerResponse() {}

    public CustomerResponse(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private String name;
        private String email;

        public Builder name(String name) { this.name = name; return this; }

        public Builder email(String email) { this.email = email; return this; }

        public CustomerResponse build() { return new CustomerResponse(name, email); }
    }


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
