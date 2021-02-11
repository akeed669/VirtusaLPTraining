package com.akeed.gunstore.gunstoreprocesstask.service;

import org.springframework.stereotype.Service;

@Service
public class SaleProcessServiceImpl implements SaleProcessService {

    @Override
    public boolean validateDL(String licenseNumber){
        return licenseNumber.length()>5;
    }
}
