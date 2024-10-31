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
@Getter
@Setter
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


}
