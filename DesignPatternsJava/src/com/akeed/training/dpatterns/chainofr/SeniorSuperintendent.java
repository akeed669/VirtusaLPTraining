package com.akeed.training.dpatterns.chainofr;

public class SeniorSuperintendent extends PoliceSuperintendent {

    public SeniorSuperintendent(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }


    @Override
    protected void logEntry(String message, boolean canHandle) {
        super.logEntry(message,canHandle);
        if (canHandle) {
            System.out.println("The Senior Superintendent of Police is working on case " + message);
        }




    }
}
