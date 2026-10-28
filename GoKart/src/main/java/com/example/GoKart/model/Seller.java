package com.example.GoKart.model;

import jakarta.persistence.*;
//import jdk.internal.org.objectweb.asm.tree.InsnList;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String pan; 

    @CreationTimestamp         //sql date import contains only date not time
    private Date created;

    @OneToMany(mappedBy = "seller",cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();
    public Seller() {}

    public Seller(int id, String name, String email, String pan, Date created, List<Product> products) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pan = pan;
        this.created = created;
        this.products = products;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private int id;
        private String name;
        private String email;
        private String pan;
        private Date created;
        private List<Product> products;

        public Builder id(int id) { this.id = id; return this; }

        public Builder name(String name) { this.name = name; return this; }

        public Builder email(String email) { this.email = email; return this; }

        public Builder pan(String pan) { this.pan = pan; return this; }

        public Builder created(Date created) { this.created = created; return this; }

        public Builder products(List<Product> products) { this.products = products; return this; }

        public Seller build() { return new Seller(id, name, email, pan, created, products); }
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
