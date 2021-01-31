package com.akeed.training.dpatterns.builder;

import java.util.LinkedHashSet;
import java.util.Set;

public class AssemblyLine {
    public static void main(String[]args){

        Set<Engine> engines = new LinkedHashSet<>();

        Engine engine1 = new Engine.EngineBuilder()
                .withEngineSize(1000)
                .withCylinders(4)
                .withGears(5)
                .build();
        engines.add(engine1);

        Engine engine2 = new Engine.EngineBuilder()
                .withEngineSize(2000)
                .withCylinders(6)
                .withGears(4)
                .withTransmissionType(Engine.EngineBuilder.TransmissionType.MANUAL)
                .withDriveType(Engine.EngineBuilder.DriveType.FWD)
                .build();
        engines.add(engine2);

        Engine engine3 = new Engine.EngineBuilder()
                .withGears(6)
                .build();
        engines.add(engine3);

        engines.forEach(System.out ::println);

    }
}
