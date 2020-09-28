public class Engine {
 private    int power;
   private  String manufacturer;
    public static void main(String[] args) {


        SportCar car = new SportCar();
        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();
        Lorry lorry = new Lorry();
        lorry.start();
        lorry.turnRight();
        lorry.turnLeft();
        lorry.stop();
    }
}

