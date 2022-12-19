package OOPBeginNo1;

public class Automobile {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
    public  String toString() {
        return "Имя марки:" + brand +"." + " Имя модели:" + model +"." + " Объём двигателя:" + engineVolume +"." + " Цвет автомобиля:" + color +"." + " Год производства:" + year +"." + " Страна производитель:" + country +".";
    }
}
