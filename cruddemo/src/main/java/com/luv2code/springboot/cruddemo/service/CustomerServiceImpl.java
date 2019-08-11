package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.dao.CustomerDAO;
import com.luv2code.springboot.cruddemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		List<Customer> customers = customerDAO.getCustomers();
		return customers;
	}

	@Override
	@Transactional
	public Customer getCustomerById(int id) {
		Customer customer = customerDAO.getCustomerById(id);
		return customer;
	}

	@Override
	@Transactional
	public void save(Customer customer) {
		customerDAO.save(customer);
		
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		customerDAO.deleteById(id);
		
	}

}
