package poc.spring.integration.service;

import poc.spring.integration.dto.Customer;

public class Greeting {
    public Customer sayHello(Customer payload) {
    	payload.setCustomerDescription("Your description modified");
        return  payload;
    }
}