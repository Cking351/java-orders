package com.lambdaschool.javaorder.repositories;

import com.lambdaschool.javaorder.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
