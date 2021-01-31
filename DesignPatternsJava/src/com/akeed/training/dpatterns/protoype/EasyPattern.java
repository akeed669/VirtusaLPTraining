package com.akeed.training.dpatterns.protoype;

public class EasyPattern extends HumanVerificationPattern{


    public EasyPattern() {
        this.lineCount = 3;

    }

    @Override
    public void generateLines(){
        super.generateLines();
        System.out.println("Successfully generated an easy pattern\n");
    }


}
