package Transport;


public class Automobile<Driverb> extends Transport<DriverB> {

    public Automobile(String brand, String model, int engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public DriverB getDriver() {
        return super.getDriver();
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
}
