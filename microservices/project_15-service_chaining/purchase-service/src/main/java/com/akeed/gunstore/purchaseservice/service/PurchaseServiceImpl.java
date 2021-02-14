package com.akeed.gunstore.purchaseservice.service;

import com.akeed.gunstore.model.customer.Customer;
import com.akeed.gunstore.model.firearm.Firearm;
import com.akeed.gunstore.model.purchase.Purchase;
import com.akeed.gunstore.purchaseservice.model.DetailedResponse;
import com.akeed.gunstore.purchaseservice.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseServiceImpl implements PurchaseService{

    @Autowired
    PurchaseRepository purchaseRepository;

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
    public DetailedResponse getPurchaseDetails(int purchaseId) {
        Purchase purchase = getPurchase(purchaseId);
        Customer customer = getCustomer(purchase.getCustomerId());
        Firearm firearm = getFirearm(purchase.getFirearmId());
        return new DetailedResponse(purchase,customer,firearm);
    }

    private Customer getCustomer(int customerId){
        return restTemplate.getForObject("http://localhost:8083/services/customers/"+customerId,Customer.class);
    }

    private Firearm getFirearm(int firearmId){
        return restTemplate.getForObject("http://localhost:8084/services/firearms/"+firearmId,Firearm.class);
    }

}
