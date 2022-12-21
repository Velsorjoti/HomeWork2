package Transport;


import java.time.LocalDate;
import java.util.stream.IntStream;

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
        private final boolean remoteenginestart;
        private final boolean keylessaccess;

        public Key(Boolean remoteenginestart, Boolean keylessaccess) {
            if (remoteenginestart == null) {
                remoteenginestart = false;
            }
            this.remoteenginestart = remoteenginestart;
            if (keylessaccess == null) {
                keylessaccess = false;
            }
            this.keylessaccess = keylessaccess;
        }

        public boolean isRemoteenginestart() {
            return remoteenginestart;
        }

        public boolean isKeylessaccess() {
            return keylessaccess;
        }
    }


    public static class Insurance {
        private final LocalDate validityperiod;
        private final String costInsurance;
        private final int numbInsurance;

        public Insurance(LocalDate validityperiod, String costInsurance, int numbInsurance) {
            this.validityperiod = validityperiod;
            if (costInsurance == null || costInsurance.length() == 0) {
                System.out.println("Неверно, попробуйте ещё раз");
            }
            this.costInsurance = costInsurance;
            if (numbInsurance == 0 || numbInsurance < 0) {
                System.out.println("Вы неверно ввели номерстраховки, или её у вас нет");
            }
            this.numbInsurance = numbInsurance;
        }

        public LocalDate getValidityperiod() {
            return validityperiod;
        }

        public String getCostInsurance() {
            return costInsurance;
        }

        public int getNumbInsurance() {
            return numbInsurance;
        }

        public void insuranceexpirationdate() {
            if (this.validityperiod == LocalDate.now()) {
                System.out.println("Ваша страховка просроченна, идите за новой");
            }
        }

        public void chekCostInsurance() {
            if (this.costInsurance.length() != 9) {
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
        if (this.wintertires == 1 ||this.wintertires == 2 ||this.wintertires == 3 ||this.wintertires == 11 ||this.wintertires == 12) {
            return true;
        }
        else {
            return false;
        }
    }
}
