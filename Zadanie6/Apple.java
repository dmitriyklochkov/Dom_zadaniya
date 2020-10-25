package Zadanie6;

import java.util.Scanner;

public class Apple {
    static float weight = 1.0f;
    private int size;
    private float weightBox;

    void box() {
        System.out.println("Введите количество яблок");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
    }

    void getWeight() {
        weightBox = weight * size;
    }
}



