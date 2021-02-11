package com.akeed.gunstore.purchaseservice.hystrix;

import com.akeed.gunstore.model.firearm.Firearm;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.web.client.RestTemplate;

public class FirearmCommand extends HystrixCommand<Firearm> {

    RestTemplate restTemplate;
    int firearmId;

    public FirearmCommand(RestTemplate restTemplate, int firearmId){
        super(HystrixCommandGroupKey.Factory.asKey("default"));
        this.restTemplate=restTemplate;
        this.firearmId=firearmId;

    }

    @Override
    protected Firearm run() throws Exception {
        return restTemplate.getForObject("http://firearm/services/firearms/"+firearmId,Firearm.class);
    }

    @Override
    protected Firearm getFallback() {
        return new Firearm();
    }
}
