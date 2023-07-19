package com.ejercicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicios.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{



}
