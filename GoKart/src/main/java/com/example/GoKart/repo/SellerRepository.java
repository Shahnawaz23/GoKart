package com.example.GoKart.repo;

import com.example.GoKart.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Component
@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer> {

    Optional<Seller> findByEmail(String sellerEmail);
}
