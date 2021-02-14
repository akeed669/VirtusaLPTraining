package com.akeed.gunstore.purchaseservice.controller;

import com.akeed.gunstore.model.purchase.Purchase;
import com.akeed.gunstore.purchaseservice.model.DetailedResponse;
import com.akeed.gunstore.purchaseservice.model.Response;
import com.akeed.gunstore.purchaseservice.model.SimpleResponse;
import com.akeed.gunstore.purchaseservice.service.PurchaseService;
import com.akeed.gunstore.purchaseservice.service.PurchaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/services")
public class PurchaseController {

    @Autowired
    PurchaseService purchaseService;

    @PostMapping("/purchases")
    public Purchase save(@RequestBody Purchase purchase) {
        return purchaseService.save(purchase);
    }

    @GetMapping("/purchases/{id}")
    public ResponseEntity<Response> getPurchase(@PathVariable(value = "id") int id, @RequestParam(required = false) String type) throws ExecutionException, InterruptedException {

        if (purchaseService.getPurchase(id) == null) {
            return ResponseEntity.notFound().build();
        }

        if (type == null) {
            SimpleResponse simpleResponse = new SimpleResponse(purchaseService.getPurchase(id));
            return ResponseEntity.ok().body(simpleResponse);
        } else {
            DetailedResponse detailedResponse = purchaseService.getPurchaseDetails(id);
            return ResponseEntity.ok().body(detailedResponse);
        }


    }

    @GetMapping("/purchases")
    public List<Purchase> getAllPurchases() {
        return purchaseService.getAllPurchases();
    }
}
