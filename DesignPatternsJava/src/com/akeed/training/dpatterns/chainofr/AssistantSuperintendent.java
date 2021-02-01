package com.akeed.training.dpatterns.chainofr;

public class AssistantSuperintendent extends PoliceSuperintendent {

    public AssistantSuperintendent(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void logEntry(String message, boolean canHandle) {
        super.logEntry(message,canHandle);
        if (canHandle) {
            System.out.println("The Assistant Superintendent of Police is working on case " + message);

        }


    }
}
