package com.javarticles.spring.integration.router;

import poc.spring.integration.dto.Customer;

public class CustomRouter {
	
	public String routeOrder(Customer cust) {
        String returnChannel = "defaultChannel";
         
        if (cust.getCustomerDescription()!=null && cust.getCustomerDescription().startsWith("US-")) {
            returnChannel = "usChannel";
        }
        
        return returnChannel;
    }

}
