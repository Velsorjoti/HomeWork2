package transport;


import drivers.DriverB;

public class Automobile extends Transport<DriverB> {
    enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбэк"),
        COUPE("Купе"),
        STATIONWAGON("Универсал"),
        OFFROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private String BodyType;

        BodyType(String bodyType) {
            BodyType = bodyType;
        }


        @Override
        public String toString() {
            return "BodyType= " + BodyType;
        }

        public String getBodyType() {
            return BodyType;
        }

        public void setBodyType(String bodyType) {
            BodyType = bodyType;
        }
    }
    public Automobile(DriverB driver, String brand, String model, int engineCapacity) {
        super(driver, brand, model, engineCapacity);
    }

    @Override
    public void setDriver(DriverB driver) {
        super.setDriver(driver);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void printType() {

    }
}