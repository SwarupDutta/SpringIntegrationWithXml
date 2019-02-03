package com.javarticles.spring.integration.filter;

import poc.spring.integration.dto.Customer;

public class CustomFilter {
	
public boolean filterInvalidCustomers(Customer customer) {
    	
    	System.out.println("Filtering......");
        if (customer == null || "invalid Customer".equalsIgnoreCase(customer.getCustomerDescription())) {
            return false;
        }
        
        return true;
    }

}
