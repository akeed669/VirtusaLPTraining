package com.akeed.gunstore.purchaseservice.service;

import com.akeed.gunstore.model.customer.Customer;
import com.akeed.gunstore.model.firearm.Firearm;
import com.akeed.gunstore.model.purchase.Purchase;
import com.akeed.gunstore.purchaseservice.hystrix.CommonHystrixCommand;
import com.akeed.gunstore.purchaseservice.hystrix.CustomerCommand;
import com.akeed.gunstore.purchaseservice.hystrix.FirearmCommand;
import com.akeed.gunstore.purchaseservice.model.DetailedResponse;
import com.akeed.gunstore.purchaseservice.repository.PurchaseRepository;
import com.netflix.hystrix.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Service
public class PurchaseServiceImpl implements PurchaseService{

    @Autowired
    PurchaseRepository purchaseRepository;

    @Autowired
    HystrixCommand.Setter setter;

    @LoadBalanced
    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Purchase save(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

    @Override
    public Purchase getPurchase(int purchaseId) {
        Optional<Purchase> purchase =  purchaseRepository.findById(purchaseId);
        if(purchase.isPresent()){
            return purchase.get();
        }
        else return null;
    }

    @Override
    public List<Purchase> getAllPurchases() {
        return purchaseRepository.findAll();
    }

    @Override
    public DetailedResponse getPurchaseDetails(int purchaseId) throws ExecutionException, InterruptedException {
        Purchase purchase = getPurchase(purchaseId);
        Customer customer = getCustomer(purchase.getCustomerId());
        Firearm firearm = getFirearm(purchase.getFirearmId());
        return new DetailedResponse(purchase,customer,firearm);
    }

    private Customer getCustomer(int customerId) throws ExecutionException, InterruptedException {

        CommonHystrixCommand<Customer> customerCommonHystrixCommand=new CommonHystrixCommand<Customer>(setter,()->{
            return restTemplate.getForObject("http://customer/services/customers/"+customerId,Customer.class);
        },()->{
            return new Customer();
        });

        Future<Customer> customerFuture=customerCommonHystrixCommand.queue();
        return customerFuture.get();


        //CustomerCommand customerCommand = new CustomerCommand(restTemplate,customerId);
        //return customerCommand.execute();
        //return restTemplate.getForObject("http://customer/services/customers/"+customerId,Customer.class);
    }

    private Firearm getFirearm(int firearmId) throws ExecutionException, InterruptedException {
        CommonHystrixCommand<Firearm> customerCommonHystrixCommand=new CommonHystrixCommand<Firearm>(setter,()->{
            return restTemplate.getForObject("http://firearm/services/firearms/"+firearmId,Firearm.class);
        },()->{
            return new Firearm();
        });

        Future<Firearm> firearmFuture=customerCommonHystrixCommand.queue();
        return firearmFuture.get();

        //FirearmCommand firearmCommand=new FirearmCommand(restTemplate,firearmId);
        //return firearmCommand.execute();
        //return restTemplate.getForObject("http://firearm/services/firearms/"+firearmId,Firearm.class);
    }

}
