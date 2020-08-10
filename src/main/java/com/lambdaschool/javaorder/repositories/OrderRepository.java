package com.lambdaschool.javaorder.repositories;

import com.lambdaschool.javaorder.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
