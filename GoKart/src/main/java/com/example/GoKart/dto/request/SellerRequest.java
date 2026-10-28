package com.example.GoKart.dto.request;

import jakarta.persistence.Column;
public class SellerRequest {

    String name;

    String email;

    String pan;
    public SellerRequest() {}

    public SellerRequest(String name, String email, String pan) {
        this.name = name;
        this.email = email;
        this.pan = pan;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private String name;
        private String email;
        private String pan;

        public Builder name(String name) { this.name = name; return this; }

        public Builder email(String email) { this.email = email; return this; }

        public Builder pan(String pan) { this.pan = pan; return this; }

        public SellerRequest build() { return new SellerRequest(name, email, pan); }
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

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }
}
