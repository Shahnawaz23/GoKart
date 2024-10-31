package com.example.GoKart.repo;

import com.example.GoKart.model.Customer;
import com.example.GoKart.model.Enum.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    List<Customer> findByAge(int age);
    Optional<Customer> findByEmail(String email);

    //    @Query(value = "select c form Customer c where c.gender = :g and c.age >= :age")
    @Query(value = "SELECT * FROM customer WHERE gender = :g AND age >= :age",nativeQuery = true)
    List<Customer> getCustomerByGenderAndAgeGreaterThan(String  g, int age);
}
