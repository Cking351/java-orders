package com.lambdaschool.javaorder.repositories;

import com.lambdaschool.javaorder.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
