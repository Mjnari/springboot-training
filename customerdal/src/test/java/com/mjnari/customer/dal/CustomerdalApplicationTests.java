package com.mjnari.customer.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mjnari.customer.dal.entities.Customer;
import com.mjnari.customer.dal.repos.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerdalApplicationTests {

	@Autowired
	CustomerRepository customerRepository;
	
	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("Jacob");
		customer.setEmail("jacob@gmail.com");
		customerRepository.save(customer);
	}
	
	@Test
	public void testReadCustomer() {
		Customer customer = customerRepository.findById(1L).get();
		System.out.println(customer);
	}
	
	@Test
	public void testUpdateCustomer() {
		Customer customer = customerRepository.findById(1L).get();
		customer.setEmail("jacob@yahoo.com");
		System.out.println(customer);
	}
	
	@Test
	public void testDeleteCustomer() {
		Customer customer = new Customer();
		customer.setId(1L);
		customerRepository.deleteById(1L);;
	}
}
