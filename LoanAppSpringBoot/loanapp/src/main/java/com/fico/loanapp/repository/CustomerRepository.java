package com.fico.loanapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fico.loanapp.model.Customer;


/** This interface implements CRUD functions and provides a method to find customer data using ssn.
 * @param customer object and type of primary key **/

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	
	Customer findByssn(int ssn);
}
