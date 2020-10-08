public class Lorry extends Car {
    private int liftingCapacity = 15;

    @Override
    protected void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    protected void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    protected void printInfo() {

        System.out.println("Автомобиль марки " + brand + " класса " + clas + " вес " + weight + " тонны  Производитель мотора " + motor.manufacturer + " мощность " + motor.power + " л.с.");
    }
}


