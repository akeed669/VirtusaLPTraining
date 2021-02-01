package com.akeed.training.dpatterns.chainofr;

public class Superintendent extends PoliceSuperintendent {

    public Superintendent(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void logEntry(String message, boolean canHandle) {

        super.logEntry(message, canHandle);

        if (canHandle) {
            System.out.println("The Superintendent is working on case " + message);

        }


    }
}
