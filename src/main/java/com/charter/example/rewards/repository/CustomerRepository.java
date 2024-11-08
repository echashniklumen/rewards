package com.charter.example.rewards.repository;

import com.charter.example.rewards.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}