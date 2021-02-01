package com.akeed.training.dpatterns.chainofr;

public class CaseHandler {

    private static PoliceSuperintendent assignCase(){
        PoliceSuperintendent ASPRoshan = new AssistantSuperintendent(PoliceSuperintendent.minorCrime);
        PoliceSuperintendent SPMalik = new Superintendent(PoliceSuperintendent.majorCrime);
        ASPRoshan.setNextSP(SPMalik);

        PoliceSuperintendent SSPAkeed = new SeniorSuperintendent(PoliceSuperintendent.seriousCrime);
        SPMalik.setNextSP(SSPAkeed);

        return ASPRoshan;
    }

    public static void main(String []args){

        PoliceSuperintendent superintendentChain = assignCase();
        superintendentChain.handleCase(PoliceSuperintendent.seriousCrime, "#24: investigate murder of S.Jobs");
        //superintendentChain.handleCase(PoliceSuperintendent.majorCrime,"#4: investigate fire in building on Dam Street");
        //superintendentChain.handleCase(PoliceSuperintendent.minorCrime, "#7: investigate theft of Ferrari");


    }
}
