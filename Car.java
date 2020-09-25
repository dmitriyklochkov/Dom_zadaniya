abstract public class Car {
protected String brand;
protected String clas;
protected int weight;
protected Engine motor;

  abstract void start();
  abstract void stop();
    void turnRight() {
       System.out.println("Поворот направо");
  }

  void turnLeft(){
      System.out.println("Поворот налево");
  }

 abstract  void printInfo(); {
    System.out.println("Автомобиль марки " + brand + "класс " + clas + "вес " + weight + "мощность мотора " + motor);
}
}