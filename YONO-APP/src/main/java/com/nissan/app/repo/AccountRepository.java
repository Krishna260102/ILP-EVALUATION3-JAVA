package com.nissan.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nissan.app.model.Account;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    // Custom queries for account management

    // Example of a custom query to find accounts by account type
    List<Account> findByAccountType(String accountType);
}