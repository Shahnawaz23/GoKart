package com.example.GoKart.model;

import com.example.GoKart.model.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.Builder;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.security.cert.CertPathBuilder;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Builder
public class Customer {
    @Id                                                          //to make a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)          //to generate id automatically
    int id;

    String name;

    int age;

//    @Column(unique = true, nullable = false)
//    @Email
    @NotNull
    String email;

    @Enumerated(EnumType.STRING)
    Gender gender;

    @CreationTimestamp
    Date created;                                                   // util import of date package include data and time both

    @OneToMany(mappedBy = "customer")
    List<OrderEntity> orders = new ArrayList<>();

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
