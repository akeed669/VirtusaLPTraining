package com.akeed.training.dpatterns.builder;

public class Engine {
    private int cylinders;
    private int displacementCC;

    public enum DriveType {
        FWD, RWD, FOURWD, AWD
    }

    EngineBuilder.DriveType driveType;

    public enum TransmissionType {
        MANUAL, AUTOMATIC
    }

    EngineBuilder.TransmissionType transmissionType;

    private int gears;

    private Engine() {
    }

    public static class EngineBuilder {
        private int cylinders;
        private int displacementCC;

        public enum DriveType {
            FWD, RWD, FOURWD, AWD
        }

        DriveType driveType;

        public enum TransmissionType {
            MANUAL, AUTOMATIC
        }

        TransmissionType transmissionType;

        private int gears;

        public EngineBuilder withCylinders(int cylinders) {
            this.cylinders = cylinders;
            return this;
        }

        public EngineBuilder withEngineSize(int displacement) {
            this.displacementCC = displacement;
            return this;
        }

        public EngineBuilder withDriveType(DriveType driveType) {
            this.driveType = driveType;
            return this;
        }

        public EngineBuilder withTransmissionType(TransmissionType transmissionType) {
            this.transmissionType = transmissionType;
            return this;
        }

        public EngineBuilder withGears(int gears) {
            this.gears = gears;
            return this;
        }

        public Engine build() {
            Engine engine = new Engine();
            engine.cylinders = this.cylinders;
            engine.displacementCC = this.displacementCC;
            engine.gears = this.gears;
            engine.driveType = this.driveType;
            engine.transmissionType = this.transmissionType;

            return engine;
        }


    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylinders=" + cylinders +
                ", displacementCC=" + displacementCC +
                ", driveType=" + driveType +
                ", transmissionType=" + transmissionType +
                ", gears=" + gears +
                '}';
    }
}
