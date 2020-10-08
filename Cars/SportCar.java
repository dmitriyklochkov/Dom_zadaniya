package Cars;

public class SportCar extends Car {
    private int topSpeed = 300;

    @Override
    protected void start() {

        System.out.println("SportCar поехал");
    }

    @Override
    protected void stop() {

        System.out.println("SportCar остановился");
    }

    @Override
    protected void printInfo() {
        System.out.println("Автомобиль марки " + brand + " класса " + clas + " вес " + weight + " тонны  Производитель мотора " + motor.manufacturer + " мощность " + motor.power + " л.с.");
    }
}