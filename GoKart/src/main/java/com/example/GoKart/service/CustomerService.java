package com.example.GoKart.service;

import com.example.GoKart.dto.request.CustomerRequest;
import com.example.GoKart.dto.response.CustomerResponse;
import com.example.GoKart.model.Customer;
import com.example.GoKart.model.Enum.Gender;
import com.example.GoKart.repo.CustomerRepository;
import com.example.GoKart.transformer.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public CustomerResponse addCustomer(CustomerRequest customerRequest) {

        Customer customer = CustomerTransformer.customerRequestToCustomer(customerRequest);

        Customer savedCustomer = customerRepository.save(customer);                       //.save(customer): The save method is a part of the JpaRepository interface,
                                                                                         // which is used to save an entity (in this case, a Customer object) to the database.

        return  CustomerTransformer.customerToCustomerResponse(savedCustomer);

    }

    public List<CustomerResponse> findByAge(int age) {
         List<Customer> customers = customerRepository.findByAge(age);

         List<CustomerResponse>  customerResponses = new ArrayList<>();

         for(Customer customer: customers) {
             customerResponses.add(CustomerTransformer.customerToCustomerResponse(customer));
         }

         return customerResponses;
    }

    public List<CustomerResponse> findByGenderAndAgeGreaterThan(String gender, int age) {

        List<Customer> customers = customerRepository.getCustomerByGenderAndAgeGreaterThan(gender,age);

        List<CustomerResponse> customerResponses = new ArrayList<>();

        for (Customer customer: customers) {
            customerResponses.add(CustomerTransformer.customerToCustomerResponse(customer));
        }

        return customerResponses;
    }
}
