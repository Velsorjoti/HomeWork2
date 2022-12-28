package transport;

import drivers.DriverC;

public class Track extends Transport<DriverC>{
    enum TypeOfCapacity {
        VERYSMALL(null,10),
        SMALL(null,25),
        MIDDLE(40,60),
        BIG(60,80),
        VERYBIG(100,120);

        private Integer from;
        private Integer to;

        TypeOfCapacity(Integer from, Integer to) {
            this.from = from;
            this.to = to;
        }

        public Integer getFrom() {
            return from;
        }

        public void setFrom(Integer from) {
            this.from = from;
        }

        public Integer getTo() {
            return to;
        }

        public void setTo(Integer to) {
            this.to = to;
        }

        @Override
        public String toString() {
            return "TypeOfCapacity{" +
                    "from=" + from +
                    ", to=" + to +
                    '}';
        }
    }
    public Track(DriverC driver, String brand, String model, int engineCapacity) {
        super(driver, brand, model, engineCapacity);
    }

    @Override
    public void printType() {

    }

}

