package com.akeed.training.dpatterns.protoype;

public class IntermediatePattern extends HumanVerificationPattern{

    public IntermediatePattern() {
        this.lineCount = 6;
    }

    @Override
    public void generateLines(){
        super.generateLines();
        System.out.println("Successfully generated an intermediate pattern\n");
    }



}
