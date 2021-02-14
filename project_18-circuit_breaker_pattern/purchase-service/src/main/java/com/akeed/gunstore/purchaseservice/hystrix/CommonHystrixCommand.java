package com.akeed.gunstore.purchaseservice.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

import java.util.function.Supplier;

public class CommonHystrixCommand<T>extends HystrixCommand<T> {

    Supplier<T> execute;
    Supplier<T> fallBack;

    public CommonHystrixCommand (String group, Supplier<T> execute){
        super(HystrixCommandGroupKey.Factory.asKey(group));
        this.execute=execute;
    }

    public CommonHystrixCommand (Setter config, Supplier<T> execute){
        super(config);
        this.execute=execute;
    }

    public CommonHystrixCommand (String group, Supplier<T> execute, Supplier<T> fallBack){
        super(HystrixCommandGroupKey.Factory.asKey(group));
        this.execute=execute;
        this.fallBack=fallBack;
    }

    public CommonHystrixCommand (Setter config, Supplier<T> execute, Supplier<T> fallBack){
        super(config);
        this.execute=execute;
        this.fallBack=fallBack;
    }

    @Override
    protected T run() throws Exception {
        return execute.get();
    }

    @Override
    protected T getFallback() {
        if(fallBack!=null){
            return fallBack.get();
        }
        return super.getFallback();
    }
}
