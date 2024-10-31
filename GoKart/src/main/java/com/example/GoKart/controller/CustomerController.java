package com.example.GoKart.controller;

import com.example.GoKart.dto.request.CustomerRequest;
import com.example.GoKart.dto.response.CustomerResponse;
import com.example.GoKart.model.Customer;
import com.example.GoKart.model.Enum.Gender;
import com.example.GoKart.repo.CustomerRepository;
import com.example.GoKart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public ResponseEntity addCustomer(@RequestBody CustomerRequest customerRequest) {
        CustomerResponse customerResponse = customerService.addCustomer(customerRequest);
        return new ResponseEntity<>(customerResponse, HttpStatus.CREATED);
    }

    @GetMapping("/age/{age}")
    public ResponseEntity findByAge(@PathVariable("age") int age) {
        List<CustomerResponse> customerResponses  = customerService.findByAge(age);
        return new ResponseEntity<>(customerResponses,HttpStatus.ACCEPTED);
    }

    @GetMapping("/gender/{gender}/age/{age}")
    public List<CustomerResponse> findByGenderAndAgeGreaterThan(@PathVariable("gender") String gender, @PathVariable("age") int age) {
        return customerService.findByGenderAndAgeGreaterThan(gender,age);
    }
}
