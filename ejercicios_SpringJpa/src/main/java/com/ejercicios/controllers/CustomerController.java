package com.ejercicios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicios.entities.Customer;
import com.ejercicios.services.CustomerService;


@RestController
@RequestMapping("/sql")
public class CustomerController {
@Autowired(required = false)
CustomerService customerService;
@RequestMapping("/customer")
public List<Customer> getCustomers(){
	return customerService.findAllCustomers();
}
}
