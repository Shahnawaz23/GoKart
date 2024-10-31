package com.example.GoKart.transformer;

import com.example.GoKart.dto.request.CustomerRequest;
import com.example.GoKart.dto.response.CustomerResponse;
import com.example.GoKart.model.Customer;
import com.example.GoKart.model.Seller;

public class CustomerTransformer {

    public static Customer customerRequestToCustomer(CustomerRequest customerRequest) {
        return Customer.builder()
                .name(customerRequest.getName())
                .age(customerRequest.getAge())
                .email(customerRequest.getEmail())
                .gender(customerRequest.getGender())
                .build();
    }

    public static CustomerResponse  customerToCustomerResponse(Customer customer) {
        return CustomerResponse.builder()
                .name(customer.getName())
                .email(customer.getEmail())
                .build();
    }
    
}
