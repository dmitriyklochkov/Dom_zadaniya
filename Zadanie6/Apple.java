package Zadanie6;

import java.util.Scanner;

public class Apple {
    static float weight = 1.0f;
    private int size;
    protected static float weightBox;


    protected void box() {
        MyArrayCollection<Apple> boxApple = new MyArrayCollection<>();
        System.out.println("Введите количество яблок");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
    }

    protected void getWeight() {
        weightBox = weight * size;
    }
}



