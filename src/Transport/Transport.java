package Transport;

public class Transport {
    protected String brand;
    protected String model;
    protected int engineCapacity;

    public Transport(String brand, String model, int engineCapacity) {
        if(brand== null || brand.length() ==0) {
            System.out.println("Вы ввели неправильные данные, попробуйте ещё.");
        } else {
            this.brand = brand;
        }
        if(model == null || model.length() ==0) {
            System.out.println("Вы ввели неправильные данные, попробуйте ещё.");
        } else {
            this.model = model;
        }
        if (engineCapacity < 0) {
            System.out.println("Вы ввели неправильные данные, попробуйте ещё.");
        }
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.length() == 0) {
            System.out.println("Вы ввели неправильные данные, попробуйте ещё.");
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.length() == 0) {
            System.out.println("Вы ввели неправильные данные, попробуйте ещё.");
        } else {
            this.model = model;
        }
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        if (engineCapacity < 0) {
            System.out.println("Вы ввели неправильные данные, попробуйте ещё.");
        } else {
            this.engineCapacity = engineCapacity;
        }
    }

    public void begginMove() {
        System.out.println("Старт!");
    }

    public void endMove() {
        System.out.println("Финиш!");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
