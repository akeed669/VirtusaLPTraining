package com.akeed.gunstore.purchaseservice.service;

import com.akeed.gunstore.model.purchase.Purchase;
import com.akeed.gunstore.purchaseservice.model.DetailedResponse;

import java.util.List;

public interface PurchaseService {
    Purchase save(Purchase purchase);

    Purchase getPurchase(int purchaseId);

    List<Purchase> getAllPurchases();

    DetailedResponse getPurchaseDetails(int id);
}
