package Transport;

public class Bus extends Transport<DriverD> implements Competing  {

    public Bus(String brand, String model, int engineCapacity) {
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
