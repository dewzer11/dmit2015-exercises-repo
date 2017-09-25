package chinook.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.CustomerRepository;
import chinook.model.Customer;


@Model  //alias for @Named/@ManagedBean and @RequestScope
public class CustomerController {
	
	@Inject
	private CustomerRepository customerRepository;
	
	private List<Customer> customers; // getter
	
	@PostConstruct
	void init() {
		customers = customerRepository.findAll();
	}
	
	public List<Customer> getCustomer() {
		return customers;
	}
			
}