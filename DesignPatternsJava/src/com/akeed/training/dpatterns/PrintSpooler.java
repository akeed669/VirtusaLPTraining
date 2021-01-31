package com.akeed.training.dpatterns;

public class PrintSpooler {

    private volatile static PrintSpooler uniqueInstance;

    private PrintSpooler() {

    }

    public static PrintSpooler getInstance() {

        if (uniqueInstance == null) {
            synchronized (PrintSpooler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new PrintSpooler();
                }
            }
        }

        return uniqueInstance;

    }
}
