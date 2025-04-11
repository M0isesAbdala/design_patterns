package car;

public class Car {
    private String engine;
    private int doors;
    private boolean hasSunroof;

    public String getEngine() {
        return engine;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    private Car(Builder builder) {
        this.engine = builder.engine;
        this.doors = builder.doors;
        this.hasSunroof = builder.hasSunroof;
    }

    public static class Builder {
        private String engine;
        private int doors;
        private boolean hasSunroof;

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder hasSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
