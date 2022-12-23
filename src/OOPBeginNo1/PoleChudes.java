package OOPBeginNo1;

import Transport.*;

public class PoleChudes {

    public static void main(String[] args) {
        Automobile ferari = new Automobile("Феррари","Ля Феррари",1000);
        Automobile lamborgini = new Automobile("Ламборджини","Диабло",1000);
        Automobile ford = new Automobile("Форд","GT",1000);
        Automobile mClaren = new Automobile("Макларен","P1",1000);
        Bus paz = new Bus("Пазик","Хорошая",1000);
        Bus uaz = new Bus("УАЗ","Буханочка",1000);
        Bus zil = new Bus("ЗИЛ","Пафосная",1000);
        Bus scania = new Bus("Скания","Буржуинская",1000);
        Track belaz = new Track("БеЛаз","Огромная",1000);
        Track kamaz = new Track("КаМаз","Раллийная",1000);
        Track maz = new Track("МАЗ","Проходимая",1000);
        Track gaz = new Track("Газель","Маршрутная",1000);
        DriverB fateful = new DriverB("Судьбоносный","Есть",10);
        DriverC voditel = new DriverC("Водитель","Есть",10);
        DriverD vodila =new DriverD("Крокодил","Есть",10);
    }
}
