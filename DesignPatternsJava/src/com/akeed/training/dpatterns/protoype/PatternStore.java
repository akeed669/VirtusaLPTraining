package com.akeed.training.dpatterns.protoype;

import java.util.LinkedHashMap;
import java.util.Map;

public class PatternStore {

    private static Map<String,HumanVerificationPattern> patternMap = new LinkedHashMap<>();

    static{
        patternMap.put("easy", new EasyPattern());
        patternMap.put("intermediate", new IntermediatePattern());
        patternMap.put("difficult", new HardPattern());
    }

    public static HumanVerificationPattern getPattern(String patternType){
        return (HumanVerificationPattern) patternMap.get(patternType).clone();
    }
}
