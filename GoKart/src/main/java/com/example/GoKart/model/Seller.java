package com.example.GoKart.model;

import jakarta.persistence.*;
//import jdk.internal.org.objectweb.asm.tree.InsnList;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)   // to make fields private(methods, variables) it has least priority
@Entity
@Builder
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    @Column(unique = true, nullable = false)
    String email;

    @Column(unique = true, nullable = false)
    String pan; 

    @CreationTimestamp         //sql date import contains only date not time
    Date created;

    @OneToMany(mappedBy = "seller",cascade = CascadeType.ALL)
    List<Product> products = new ArrayList<>();

}
