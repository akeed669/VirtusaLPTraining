package com.akeed.training.dpatterns.protoype;

public abstract class HumanVerificationPattern implements Cloneable {

    protected int lineCount;
    protected static final int dotCount = 270;
    protected static final String color = "black";

    public void generateLines(){
        int dotsPerLine = HumanVerificationPattern.dotCount/this.lineCount;
        for(int l=0;l<this.lineCount;l++){
            for(int dpl=0;dpl<dotsPerLine;dpl++){
                System.out.print(".");
            }
            System.out.println();
        }

    }

    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }


}
