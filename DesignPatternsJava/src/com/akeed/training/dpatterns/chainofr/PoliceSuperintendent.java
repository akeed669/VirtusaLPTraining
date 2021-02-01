package com.akeed.training.dpatterns.chainofr;

public class PoliceSuperintendent {
    public static int minorCrime = 1;
    public static int majorCrime = 2;
    public static int seriousCrime = 3;

    protected int authorityLevel;

    protected PoliceSuperintendent nextSuperintendent;

    public void setNextSP(PoliceSuperintendent policeSuperintendent) {
        this.nextSuperintendent = policeSuperintendent;

    }

    public void handleCase(int authorityLevel, String message) {
        if (this.authorityLevel < authorityLevel) {
            logEntry(message, false);
        } else if (this.authorityLevel == authorityLevel) {
            logEntry(message, true);

        }
        if (nextSuperintendent != null) {
            nextSuperintendent.handleCase(authorityLevel, message);
        }
    }



    protected void logEntry(String message, boolean canHandle) {
        if (!canHandle) {
            System.out.println("This " + this.getClass().getSimpleName()+ "officer is not senior enough to handle this case! Contacting superior officer...");

        }

    }


}
