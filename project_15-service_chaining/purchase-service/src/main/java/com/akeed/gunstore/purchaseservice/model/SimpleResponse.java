package com.akeed.gunstore.purchaseservice.model;

import com.akeed.gunstore.model.purchase.Purchase;
import lombok.Data;

@Data
public class SimpleResponse implements Response{
    Purchase purchase;

    public SimpleResponse(Purchase purchase) {
        this.purchase = purchase;
    }


}
