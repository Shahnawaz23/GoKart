package com.example.GoKart.model;

import com.example.GoKart.model.Enum.Gender;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.security.cert.CertPathBuilder;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Customer {
    @Id                                                          //to make a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)          //to generate id automatically
    private int id;

    private String name;

    private int age;

//    @Column(unique = true, nullable = false)
//    @Email
    @NotNull
    private String email;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @CreationTimestamp
    private Date created;                                                   // util import of date package include data and time both

    @OneToMany(mappedBy = "customer")
    private List<OrderEntity> orders = new ArrayList<>();
    public Customer() {}

    public Customer(int id, String name, int age, String email, Gender gender, Date created, List<OrderEntity> orders) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.created = created;
        this.orders = orders;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private int id;
        private String name;
        private int age;
        private String email;
        private Gender gender;
        private Date created;
        private List<OrderEntity> orders;

        public Builder id(int id) { this.id = id; return this; }

        public Builder name(String name) { this.name = name; return this; }

        public Builder age(int age) { this.age = age; return this; }

        public Builder email(String email) { this.email = email; return this; }

        public Builder gender(Gender gender) { this.gender = gender; return this; }

        public Builder created(Date created) { this.created = created; return this; }

        public Builder orders(List<OrderEntity> orders) { this.orders = orders; return this; }

        public Customer build() { return new Customer(id, name, age, email, gender, created, orders); }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public List<OrderEntity> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderEntity> orders) {
        this.orders = orders;
    }
}
