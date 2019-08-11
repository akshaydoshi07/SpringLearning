package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import com.luv2code.springboot.cruddemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public Customer getCustomerById(int id);

	public void save(Customer customer);

	public void deleteById(int id);

}
