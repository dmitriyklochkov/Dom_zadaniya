public abstract class SportCar extends Car {
   private int  topSpeed = 300;

    @Override
    void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    void stop() {
        System.out.println("SportCar остановился");
    }
}
