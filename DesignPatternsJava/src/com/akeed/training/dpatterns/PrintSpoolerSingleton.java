package com.akeed.training.dpatterns;

public class PrintSpoolerSingleton {

    private volatile static PrintSpoolerSingleton uniqueInstance;

    private PrintSpoolerSingleton() {

    }

    public static PrintSpoolerSingleton getInstance() {

        if (uniqueInstance == null) {
            synchronized (PrintSpoolerSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new PrintSpoolerSingleton();
                }
            }
        }

        return uniqueInstance;

    }
}
