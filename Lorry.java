public class Lorry extends Car {
    private int liftingCapacity = 15;

    @Override
    void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    void printInfo() {
        System.out.println("Автомобиль марки " + brand + " класс " + clas + " вес " + weight + " мощность мотора " + motor);
    }
}


