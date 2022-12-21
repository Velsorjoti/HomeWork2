package OOPBeginNo1;

import Transport.Automobile;

public class PoleChudes {

    public static void main(String[] args) {
        Automobile Lada = new Automobile("Лада","Гранта",3.0d,"Жёлтый",2015,"Россия","Механическая","Купе", 001,5,true);
        Automobile Audi = new Automobile("Ауди","A8",3.0d,"Чёрный",2020,"Германия","Автоматическая","Купе",002, 5,true);
        Automobile BMVW = new Automobile("БМВ","Z8",3.0d,"Чёрный",2021,"Германия","Автоматическая","Родстер",003,2,false);
        Automobile KIA = new Automobile("Киа","Sportage",2.4d,"Красный",2018,"Южной Корея","Автоматическая","Купе",004, 4,false);
        Automobile Hyundai = new Automobile("Хёндай","Avante",1.6d,"Оранжевый",2016,"Южной Корея","Автоматическая","Купе",005, 5,true);
        System.out.println(Lada);
        System.out.println(Audi);
        System.out.println(BMVW);
        System.out.println(KIA);
        System.out.println(Hyundai);
    }
}
