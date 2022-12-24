package Transport;


public class Automobile extends Transport<DriverB> {

    public Automobile(String brand, String model, int engineCapacity) {
        super(brand, model, engineCapacity);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
