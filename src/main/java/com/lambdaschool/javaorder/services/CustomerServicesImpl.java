package com.lambdaschool.javaorder.services;

import com.lambdaschool.javaorder.models.Customer;
import com.lambdaschool.javaorder.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerServices")
public class CustomerServicesImpl implements CustomerServices{
    @Autowired
    CustomerRepository custrepos;

    @Override
    public Customer save(Customer customer) {
        return custrepos.save(customer);
    }
}
