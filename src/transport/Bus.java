package transport;



import drivers.DriverD;

public class Bus extends Transport<DriverD> {

    enum LoadCapacity {
        N1(0f,3.5f),
        N2(3.5f,12f),
        N3(12,0f);
        private float from;
        private float to;

        LoadCapacity(float from, float to) {
            this.from = from;
            this.to = to;

        }

        public float getFrom() {
            return from;
        }

        public void setFrom(float from) {
            this.from = from;
        }

        public float getTo() {
            return to;
        }

        public void setTo(float to) {
            this.to = to;
        }

        @Override
        public String toString() {
            return "LoadCapacity{" +
                    "from=" + from +
                    ", to=" + to +
                    '}';
        }


    }
    public Bus(DriverD driver, String brand, String model, int engineCapacity) {
        super(driver, brand, model, engineCapacity);
    }

    @Override
    public void printType() {

    }

}



