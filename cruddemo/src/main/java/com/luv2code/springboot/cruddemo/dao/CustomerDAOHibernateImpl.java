package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Customer;

@Repository
public class CustomerDAOHibernateImpl implements CustomerDAO {

	private EntityManager entityManager;

	@Autowired
	public CustomerDAOHibernateImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Customer> getCustomers() {
		Session session = entityManager.unwrap(Session.class);

		Query<Customer> theQuery = session.createQuery("from Customer", Customer.class);

		List<Customer> customers = theQuery.getResultList();

		return customers;
	}

	@Override
	public Customer getCustomerById(int id) {
		Session session = entityManager.unwrap(Session.class);

		Customer customer = session.get(Customer.class, id);
		return customer;
	}

	@Override
	public void save(Customer customer) {
		Session session = entityManager.unwrap(Session.class);

		session.saveOrUpdate(customer);

	}

	@Override
	public void deleteById(int id) {
		Session session = entityManager.unwrap(Session.class);

		Query query = session.createQuery("delete from Customer where id=:customerId");
		query.setParameter("customerId", id);
		query.executeUpdate();

	}

}
