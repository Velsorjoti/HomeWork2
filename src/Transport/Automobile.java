package Transport;


import java.time.LocalDate;
import java.util.stream.IntStream;

public class Automobile extends Transport implements Competing {
    public Automobile(String brand, String model, int engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void begginMove() {
        super.begginMove();
    }

    @Override
    public void endMove() {
        super.endMove();
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп, ну что тут ещё напишешь");
    }

    @Override
    public void bestRingTime() {
        System.out.println("Лучшее время круга");
    }

    @Override
    public void maxSpeed() {

    }
}
