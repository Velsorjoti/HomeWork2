package OOPBeginNo1;

import Transport.Automobile;
import Transport.Bus;

public class PoleChudes {

    public static void main(String[] args) {
        Automobile Lada = new Automobile("Лада","Гранта",3.0d,"Жёлтый",2015,"Россия","1","Купе", 1,5,true);
        Automobile Audi = new Automobile("Ауди","A8",3.0d,"Чёрный",2020,"Германия","2","Купе",2, 5,true);
        Automobile BMVW = new Automobile("БМВ","Z8",3.0d,"Чёрный",2021,"Германия","3","Родстер",3,2,false);
        Automobile KIA = new Automobile("Киа","Sportage",2.4d,"Красный",2018,"Южной Корея","4","Купе",4, 4,false);
        Automobile Hyundai = new Automobile("Хёндай","Avante",1.6d,"Оранжевый",2016,"Южной Корея","5","Купе",5, 5,true);
        Bus pazik = new Bus("Пазюня","Надёжная","Жёлтый",1980,"CCCР");
        Bus scania = new Bus("Скания","Буржуйская","Сине-голубой",2005,"Швеция");
        Bus uazik = new Bus("Буханочка","Народная","Классический", 1962,"СССР");
        System.out.println(pazik);
        System.out.println(scania);

        System.out.println(uazik);
    }
}
