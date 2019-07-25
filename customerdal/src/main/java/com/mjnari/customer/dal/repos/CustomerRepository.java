package com.mjnari.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.mjnari.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
