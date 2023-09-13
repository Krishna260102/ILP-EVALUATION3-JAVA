package com.nissan.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nissan.app.model.Customer;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByAccountNumber(String accountNumber);

    // Other custom queries if needed

    // Example of a custom query:
    // List<Customer> findByAccountType(String accountType);
}