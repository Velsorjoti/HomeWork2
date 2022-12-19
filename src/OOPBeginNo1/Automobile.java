package OOPBeginNo1;

public class Automobile {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Automobile(String brand, String model, double engineVolume, String color, int year, String country) {
        if (this.brand != null || this.brand.length() != 0) {
            this.brand = brand;
        } else {
            this.brand = "Машина";
        }
        if (this.model != null || this.model.length() != 0) {
            this.model = model;
        } else {
            this.model = "Классическая";
        }
        if (this.engineVolume <= 0) {
            this.engineVolume = 1.5d;
        } else {
            this.engineVolume = engineVolume;
        }
        if (this.color != null || this.color.length() != 0) {
            this.color = color;
        } else {
            this.color = "Белый";
        }
        if (this.year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (this.country != null || this.country.length() != 0) {
            this.country = country;
        } else {
            this.country = "Россия Матушка";
        }
    }



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public  String toString() {
        return "Имя марки:" + brand +"." + " Имя модели:" + model +"." + " Объём двигателя:" + engineVolume +"." + " Цвет автомобиля:" + color +"." + " Год производства:" + year +"." + " Страна производитель:" + country +".";
    }
}
