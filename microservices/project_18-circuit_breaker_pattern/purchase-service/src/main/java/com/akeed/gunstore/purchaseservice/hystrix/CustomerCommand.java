package com.akeed.gunstore.purchaseservice.hystrix;

import com.akeed.gunstore.model.customer.Customer;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.web.client.RestTemplate;

public class CustomerCommand extends HystrixCommand<Customer> {

    RestTemplate restTemplate;
    int customerId;

    public CustomerCommand(RestTemplate restTemplate, int customerId){
        super(HystrixCommandGroupKey.Factory.asKey("default"));
        this.restTemplate=restTemplate;
        this.customerId=customerId;

    }

    @Override
    protected Customer run() throws Exception {
        return restTemplate.getForObject("http://customer/services/customers/"+customerId,Customer.class);
    }

    @Override
    protected Customer getFallback() {
        return new Customer();
    }
}
