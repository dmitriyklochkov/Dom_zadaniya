import java.util.Scanner;

public class MainEngine {
    public static void main(String[] args) {
        SportCar car = new SportCar();
        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();
        car.printInfo();

        Lorry lorry = new Lorry();
        lorry.start();
        lorry.turnRight();
        lorry.turnLeft();
        lorry.stop();
        lorry.printInfo();


    }
}
