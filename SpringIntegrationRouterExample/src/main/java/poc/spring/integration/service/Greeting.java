package poc.spring.integration.service;

import poc.spring.integration.dto.Customer;

public class Greeting {
    public Customer processOrderForUsCustomer(Customer payload) {
    	payload.setCustomerDescription("Your are  US customer");
        return  payload;
    }
    
    public Customer processOrderForGeneralCustomer(Customer payload) {
    	payload.setCustomerDescription("Your are  general customer");
        return  payload;
    }
}