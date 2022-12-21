package Transport;

public class Bus extends Transport{
    public Bus(String brand, String model, String color, int year, String country) {
        super(brand, model, color, year, country);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
