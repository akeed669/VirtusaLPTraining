package com.akeed.gunstore.purchaseservice.model;

import com.akeed.gunstore.model.customer.Customer;
import com.akeed.gunstore.model.firearm.Firearm;
import com.akeed.gunstore.model.purchase.Purchase;
import lombok.Data;

@Data
public class DetailedResponse implements Response{

    Purchase purchase;
    Customer customer;
    Firearm firearm;

    public DetailedResponse(Purchase purchase, Customer customer, Firearm firearm) {
        this.purchase = purchase;
        this.customer = customer;
        this.firearm = firearm;
    }

    public DetailedResponse(Purchase purchase) {
        this.purchase = purchase;
    }
}
