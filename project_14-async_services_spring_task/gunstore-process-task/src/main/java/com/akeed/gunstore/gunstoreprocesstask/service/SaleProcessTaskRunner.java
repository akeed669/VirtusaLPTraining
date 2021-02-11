package com.akeed.gunstore.gunstoreprocesstask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class SaleProcessTaskRunner implements CommandLineRunner {

    @Autowired
    SaleProcessService saleProcessService;

    @Override
    public void run(String... args) throws Exception {

        if(args.length>0) {
            System.out.println("task running with arguments");

            if (saleProcessService.validateDL(args[0])) {
                System.out.println("valid gun license");
            } else
                System.out.println("invalid gun license");
        }else
            System.out.println("task running without arguments");


    }


}
