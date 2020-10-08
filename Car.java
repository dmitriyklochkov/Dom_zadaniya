import java.util.Scanner;

abstract public class Car {
    protected String brand;
    protected String clas;
    protected int weight;
    protected Engine motor= new Engine();

  protected   abstract void start();

    protected abstract void stop();

    protected void turnRight() {

        System.out.println("Поворот направо");
    }

    protected void turnLeft() {

        System.out.println("Поворот налево");
    }

   protected abstract void printInfo();

 Car() {
     System.out.println("Введите через пробел вес автомобиля и марку автомобиля");
    Scanner scanner =new Scanner(System.in);
    weight = scanner.nextInt();
    brand = scanner.nextLine();
     System.out.println("Введите класс автомобиля");
    clas = scanner.nextLine();
     System.out.println("Введите мощность мотора  и производителя");
     motor.power = scanner.nextInt();
    motor.manufacturer = scanner.nextLine();
}
}