package OOPBeginNo1;

public class PoleChudes {

    public static void main(String[] args) {
        Automobile Lada = new Automobile();
        Automobile Audi = new Automobile();
        Automobile BMVW = new Automobile();
        Automobile KIA = new Automobile();
        Automobile Hyundai = new Automobile();
        Lada.brand = "Лада";
        Lada.model = "Гранта";
        Lada.engineVolume = 3.0d;
        Lada.color = "Жёлтый";
        Lada.year = 2015;
        Lada.country = "Россия";
        Audi.brand = "Ауди";
        Audi.model = " A8 ";
        Audi.engineVolume = 3.0d;
        Audi.color = "Чёрный";
        Audi.year = 2020;
        Audi.country = "Германия";
        BMVW.brand = "БМВ";
        BMVW.model = " Z8 ";
        BMVW.engineVolume = 3.0d;
        BMVW.color = "Чёрный";
        BMVW.year = 2021;
        BMVW.country = "Чёрный";
        KIA.brand = " Кия ";
        KIA.model = "Sportage";
        KIA.engineVolume = 2.4d;
        KIA.color = "Красный";
        KIA.year =  2018;
        KIA.country = "Южной Корея";
        Hyundai.brand = "Хёндай";
        Hyundai.model = "Avante";
        Hyundai.engineVolume = 1.6d;
        Hyundai.color = "Оранжевый";
        Hyundai.year = 2016;
        Hyundai.country = "Южной Корея";
        System.out.println(Lada);
        System.out.println(Audi);
        System.out.println(BMVW);
        System.out.println(KIA);
        System.out.println(Hyundai);
    }
}
