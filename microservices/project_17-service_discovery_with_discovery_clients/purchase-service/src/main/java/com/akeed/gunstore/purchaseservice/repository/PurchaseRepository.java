package com.akeed.gunstore.purchaseservice.repository;

import com.akeed.gunstore.model.purchase.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase,Integer> {
}
