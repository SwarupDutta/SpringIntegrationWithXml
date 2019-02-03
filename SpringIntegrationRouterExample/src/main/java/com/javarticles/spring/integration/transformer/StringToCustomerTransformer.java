package com.javarticles.spring.integration.transformer;

import poc.spring.integration.dto.Customer;

public class StringToCustomerTransformer {
	
	
	public Customer transform(String customerId)
	{
		//System.out.println("Constructing customer with id"+customerId);
		Customer customer=new Customer(customerId);
		customer.setCustomerDescription("US-");
		return customer;
	}

}
