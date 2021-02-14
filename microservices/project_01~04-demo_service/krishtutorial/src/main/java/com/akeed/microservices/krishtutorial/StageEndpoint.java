package com.akeed.microservices.krishtutorial;

import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id="stage")
public class StageEndpoint {

    Map<String,Stage> stages = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String,Stage> getStages(){
        return stages;
    }

    @ReadOperation
    public Stage getStage(@Selector String stageKey){
        return stages.get(stageKey);
    }

    @WriteOperation
    public void setValue(@Selector String stageKey, int stage){
        stages.put(stageKey,new Stage(stage));
    }

    @DeleteOperation
    public void deleteValue(@Selector String stageKey){
        stages.remove(stageKey);
    }

    static class Stage{
        int value;

        public Stage(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
