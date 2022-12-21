package Transport;

public class Transport {
    protected String brand;
    protected String model;
    protected String color;
    protected final int year;
    protected final String country;
    protected int maxSpeedMove;

    public Transport(String brand, String model, String color, int year, String country) {
        if (brand == null || brand.length() == 0) {
            System.out.println("Неверно, попробуйте ещё раз");
        }
        this.brand = brand;
        if (model == null || model.length() == 0) {
            System.out.println("Неверно, попробуйте ещё раз");
        }
        this.model = model;
        if ( color==null || color.length() == 0){
            System.out.println("Неверно, попробуйте ещё раз");
        }
        this.color = color;
        this.year = year;
        if ( country==null || country.length() == 0){
            System.out.println("Неверно, попробуйте ещё раз");
        }
        this.country = country;
        if ( maxSpeedMove<= 0) {
            System.out.println("Вы вели неправильные данные");
        } else {
            this.maxSpeedMove = maxSpeedMove ;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
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

    public int getMaxSpeedMove() {
        return maxSpeedMove;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeedMove(int maxSpeedMove) {
        this.maxSpeedMove = maxSpeedMove;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", maxSpeedMove=" + maxSpeedMove +
                '}';
    }
}
