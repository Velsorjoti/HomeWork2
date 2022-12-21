package Transport;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Automobile {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodystyle;
    private int registrNumber;
    private final int numberSeats;
    private boolean wintertires;

    public static class Key {
       private final boolean remoteenginestart = true;
       private final boolean keylessaccess = true;
    }

    public static class Insurance {
       private final int validityperiod = 5;
       private final String costInsurance;
       private final int numbInsurance;

        public Insurance(int validityperiod, String costInsurance, int numbInsurance) {
            validityperiod = 5;
            this.costInsurance = costInsurance;
            this.numbInsurance = numbInsurance;
        }

        public int getValidityperiod() {
            return validityperiod;
        }

        public String getCostInsurance() {
            return costInsurance;
        }

        public int getNumbInsurance() {
            return numbInsurance;
        }

        public  void insuranceexpirationdate() {
            if (this.validityperiod > 5) {
                System.out.println("Ваша страховка просроченна, идите за новой");
            }
        }

        public void chekCostInsurance() {
            if(this.costInsurance.length() != 9){
                System.out.println("Номер страховки некорректный");
            }
        }
    }

    public Automobile(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodystyle, int registrNumber, int numberSeats, boolean wintertires) {
        this.brand = brand;
        this.model = model;
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

        this.year = year;
        this.country = country;
        if (this.transmission != null || this.transmission.length() != 0) {
            this.transmission = color;
        } else {
            this.color = "У вас проблемы с трансимиссией, скорее всего её нет, обратитесь пожалуйста в автосервис.";
        }
        this.bodystyle = bodystyle;
        if (this.registrNumber <= 0) {
            System.out.println(" Вы указали несуществующий номер номер, попробуйте ещё раз. ");
        } else {
            this.registrNumber = registrNumber;
        }
        this.numberSeats = numberSeats;
        this.wintertires = wintertires;
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

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Имя марки:" + brand + "." + " Имя модели:" + model + "." + " Объём двигателя:" + engineVolume + "." + " Цвет автомобиля:" + color + "." + " Год производства:" + year + "." + " Страна производитель:" + country + ".";
    }

    public String getBodystyle() {
        return bodystyle;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getRegistrNumber() {
        return registrNumber;
    }

    public void setRegistrNumber(int registrNumber) {
        this.registrNumber = registrNumber;
    }

    public boolean isWintertires() {
        return wintertires;
    }

    public void setWintertires(boolean wintertires) {
        this.wintertires = wintertires;
    }

    public boolean changeSeasonTires(boolean wintertires) {
        if (this.wintertires) {
            return true;
        } else {
            return false;
        }
    }
}
