package com.example.accessingdatajpa.service;

import com.example.accessingdatajpa.model.Customer;
import com.example.accessingdatajpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> getCustomerByLastName(String lastName){
        return customerRepository.findByLastName(lastName);
    }
}
