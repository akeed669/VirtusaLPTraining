package com.akeed.training.dpatterns.protoype;

public class HardPattern extends HumanVerificationPattern{

    public HardPattern() {
        this.lineCount = 9;
    }

    @Override
    public void generateLines(){
        super.generateLines();
        System.out.println("Successfully generated a hard pattern\n");
    }


}
