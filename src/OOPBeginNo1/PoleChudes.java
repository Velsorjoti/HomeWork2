package OOPBeginNo1;

public class PoleChudes {

    public static void main(String[] args) {
        Automobile Lada = new Automobile("Лада","Гранта",3.0d,"Жёлтый",2015,"Россия");
        Automobile Audi = new Automobile("Ауди","A8",3.0d,"Чёрный",2020,"Германия");
        Automobile BMVW = new Automobile("БМВ","Z8",3.0d,"Чёрный",2021,"Германия");
        Automobile KIA = new Automobile("Киа","Sportage",2.4d,"Красный",2018,"Южной Корея");
        Automobile Hyundai = new Automobile("Хёндай","Avante",1.6d,"Оранжевый",2016,"Южной Корея");
        System.out.println(Lada);
        System.out.println(Audi);
        System.out.println(BMVW);
        System.out.println(KIA);
        System.out.println(Hyundai);
    }
}
